package ar.com.media.objetos;

public class Pelicula extends Media{

	private String comando;
	
	public Pelicula(String categoria, String ubicacion, String nombre,
			String descripcion, String image) {
		super(categoria, ubicacion, nombre, descripcion, image);
		// TODO Auto-generated constructor stub
	}

	public String getComando() {
		return comando;
	}

	public void setComando(String comando) {
		this.comando = comando;
	}
	
}
