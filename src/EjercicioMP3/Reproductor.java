package EjercicioMP3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reproductor {

	/**
	 * @author Rubén García
	 * @version 1.0
	 * 
	 */
	
	private String propietario;
	private String marca;
	private String modelo;
	private LocalDate f_fabricacion;
	private ArrayList<Lista> listas;

	public Reproductor() {
		super();
	}

	public Reproductor(String propietario, String marca, String modelo, LocalDate f_fabricacion, ArrayList listas) {
		super();
		this.propietario = propietario;
		this.marca = marca;
		this.modelo = modelo;
		this.f_fabricacion = f_fabricacion;
		this.listas = listas;
	}


	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public LocalDate getF_fabricacion() {
		return f_fabricacion;
	}

	public void setF_fabricacion(LocalDate f_fabricacion) {
		this.f_fabricacion = f_fabricacion;
	}

}
