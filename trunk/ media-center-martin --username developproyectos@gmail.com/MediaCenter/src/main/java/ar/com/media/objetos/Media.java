package ar.com.media.objetos;

public class Media {

	//juego,pelicula,etc
	private String categoria;
	//ubicacion del archivo
	private String ubicacion;
	//nombre
	private String titulo;
	//descripcion
	private String descripcion;
	//imagen
	private String image;
	
	public Media(String categoria, String ubicacion, String titulo,
			String descripcion, String image) {
		super();
		this.categoria = categoria;
		this.ubicacion = ubicacion;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.image = image;
	}
	
	
	
	
}
