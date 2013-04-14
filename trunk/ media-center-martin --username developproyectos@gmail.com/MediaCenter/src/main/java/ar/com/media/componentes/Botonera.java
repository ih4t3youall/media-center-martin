package ar.com.media.componentes;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JPanel;

public class Botonera extends JPanel {

	private static final long serialVersionUID = 1L;
	protected String[] labels;
	protected Button flechaIzq;
	protected Button flechaDer;
	protected Button boton;
	protected LinkedList<Button> botones = new LinkedList<Button>();
	protected int terna;
	protected int ternas;
	protected JPanel panelBotones;
	protected String tipo;
	protected LinkedList<Button> hijos;
	
	public Botonera(String[] label) {

		setLayout(new BorderLayout());

		panelBotones = new JPanel();
		panelBotones.setLayout(new FlowLayout());

		this.labels = label;
		terna = 0;
		 double numeroDouble = (double)labels.length;
		 double d =  (numeroDouble/3);
		ternas =(int)Math.ceil(d);
		flechaIzq = new Button("<");
		flechaDer = new Button(">");
		add(flechaIzq, BorderLayout.LINE_START);
		add(flechaDer, BorderLayout.LINE_END);

		for (int i = 0; i < 3; i++) {

			boton = new Button(labels[i]);
			panelBotones.add(boton);

		}

		add(panelBotones, BorderLayout.CENTER);

		flechaIzq.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				terna--;
				if (terna >= 0) {
					panelBotones.removeAll();

					int cantidad;
					if (labels.length <((terna*3)+3)){
						cantidad = labels.length;
					}else {
						cantidad =(terna*3)+3;
					}
					
					for (int i = (terna * 3); i < cantidad; i++) {

						boton = new Button(labels[i]);
						panelBotones.add(boton, BorderLayout.CENTER);
					}
					panelBotones.revalidate();
					panelBotones.repaint();
				}else {
					terna++;
					
				}
			}
		});

		flechaDer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				terna++;
				if (!(terna == ternas)) {
					panelBotones.removeAll();

					int cantidad;
					if (labels.length <((terna*3)+3)){
						cantidad = labels.length;
					}else {
						cantidad =(terna*3)+3;
					}
					
					for (int i = (terna * 3); i < cantidad; i++) {

						String label = labels[i];
						
						boton = new Button(label);
						panelBotones.add(boton, BorderLayout.CENTER);

					}
					panelBotones.revalidate();
					panelBotones.repaint();

				} else {

					terna--;

				}
			}
		});

	}

}
