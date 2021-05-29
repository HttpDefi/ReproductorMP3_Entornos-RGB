package EjercicioMP3;

import java.util.ArrayList;

public class Lista {

	/**
	 * @author Rubén García
	 * @version 1.0
	 * 
	 */
	
	private ArrayList<Cancion> listaCanciones = new ArrayList<Cancion>();
	private String nombreLista;
	private String categoria;

	public Lista() {
		super();
	}

	public Lista( String nombreLista, String categoria) {
		super();
		this.nombreLista = nombreLista;
		this.categoria = categoria;
	}

	public ArrayList<Cancion> getListaCanciones() {
		return listaCanciones;
	}

	public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
		this.listaCanciones = listaCanciones;
	}

	public String getNombreLista() {
		return nombreLista;
	}

	public void setNombreLista(String nombreLista) {
		this.nombreLista = nombreLista;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String nombreCancione() {
	
		String cancion = "Cancion";
		
		return cancion;
	}

}
