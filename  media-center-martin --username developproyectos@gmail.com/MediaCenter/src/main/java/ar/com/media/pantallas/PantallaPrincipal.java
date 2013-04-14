package ar.com.media.pantallas;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ar.com.media.componentes.Botonera;
import ar.com.media.componentes.TextAreaCustom;
import ar.com.media.panelesCustomizados.PanelImagen;

public class PantallaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] labelBotones = {"juegos","Peliculas","Series","yhonose","dos"};
	private String[] labelCategorias = {"accion","guerra","rawson","complicado","dos"};
	private String[] labelTitulos = {"sonic","metal","gear","solid","starcraft"};
	private JPanel panelTitulo =  new JPanel();
	private JPanel panelDescripcion=new JPanel();
	private JPanel panelSuperior= new JPanel();
	private JPanel panelCentral= new JPanel();
	private PanelImagen panelImagen;
	private Botonera panelBotoneraPrincipal=new Botonera(labelBotones);
	private Botonera panelBotoneraCategorias=new Botonera(labelCategorias);
	private Botonera panelPlay = new Botonera(labelTitulos);
	
	private TextAreaCustom descripcion= new TextAreaCustom() ;
	
	public PantallaPrincipal(){
		
		super("Media Center");
		
		
		this.getContentPane().setLayout(new BorderLayout());
		JLabel titulo = new JLabel("un titulo"); 
		
		panelTitulo.add(titulo);
		
		panelDescripcion.add(descripcion);

		panelImagen = new PanelImagen();
		
		
		panelSuperior.setLayout(new GridLayout(0,1));
		panelSuperior.add(panelTitulo);
		panelSuperior.add(panelBotoneraPrincipal);
		panelSuperior.add(panelBotoneraCategorias);
		add(panelSuperior,BorderLayout.PAGE_START);

		panelCentral.setLayout(new GridLayout(0,2));
		descripcion.setText("                                                          ");
		
		add(panelCentral,BorderLayout.CENTER);
		panelCentral.add(panelImagen);
		panelCentral.add(panelDescripcion);
		
		add(panelPlay,BorderLayout.PAGE_END);
		
		setResizable(false);
		setSize(500,500);
		setLocation(400,400);
		setVisible(true);
		
	}
	
	
	
	
}
