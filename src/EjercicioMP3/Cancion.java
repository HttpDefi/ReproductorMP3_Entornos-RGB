package EjercicioMP3;

import java.time.LocalDate;

public class Cancion {

	/**
	 * @author Rubén García
	 * @version 1.0
	 * 
	 */
	
	private int duracion;
	private String titulo;
	private String artista;
	private LocalDate fecha;

	public Cancion() {
		super();
	}

	// CONSTRUCTOR //
	
	public Cancion(int duracion, String titulo, String artista, LocalDate fecha) {
		super();
		this.duracion = duracion;
		this.titulo = titulo;
		this.artista = artista;
		this.fecha = fecha;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	/**
	 * @author HttpD
	 * Método para reproducir la canción 
	 * @return
	 */
	public String start() {
		 
		System.out.println("Empezando la cancion... " + getTitulo());
		
		return this.titulo;
		
	}
	
	/**
	 * @author HttpD
	 * Método para parar la cancion
	 */
	public void stop() {
		
		
		System.out.println("Parando la cancion... " + getTitulo());

		
	}
	
	/**
	 * Método para ir a un segundo de la cancion
	 * @author HttpD
	 * @param segundo
	 */
	public void irA(int segundo) {
		
		
	}

}
