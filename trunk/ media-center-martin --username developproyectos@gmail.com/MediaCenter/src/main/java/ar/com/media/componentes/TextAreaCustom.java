package ar.com.media.componentes;

import javax.swing.JTextArea;

public class TextAreaCustom extends JTextArea {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TextAreaCustom(){
		setEditable(false);
		setColumns(5);
		setRows(16);
		setText("                                                          ");
	}
	
}
