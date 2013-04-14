package ar.com.media.panelesCustomizados;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImagen extends JPanel {

	  private Image img;
	  private static final int IMG_WIDTH = 300;
	  private static final int IMG_HEIGHT = 260;


	  public PanelImagen(String img) {
	    this(new ImageIcon(img).getImage());
	  }
	  
	  public PanelImagen(){
			img = new ImageIcon("resources/imagenes/Tails.jpg").getImage();
		  
	  }

	  public PanelImagen(Image img) {
	    this.img = img;
	    Dimension size = new Dimension(100,75);
	    setPreferredSize(size);
	    setMinimumSize(size);
	    setMaximumSize(size);
	    setSize(size);
	    setVisible(true);
	  }

	  public void paintComponent(Graphics g) {
	    g.drawImage(img, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
	  }

}