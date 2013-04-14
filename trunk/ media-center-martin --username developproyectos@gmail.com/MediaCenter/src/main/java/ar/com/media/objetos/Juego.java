package ar.com.media.objetos;

public class Juego extends Media{

	
	private String comando;
	
	public Juego(String categoria, String ubicacion, String nombre,
			String descripcion, String image) {
		super(categoria, ubicacion, nombre, descripcion, image);
		
	}

	public String getComando() {
		return comando;
	}

	public void setComando(String comando) {
		this.comando = comando;
	}
	
	
	

}
