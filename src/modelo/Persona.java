package modelo;

public class Persona {

	private String nombre;
	private int edad;
	private String direccion;

	public Persona() {

	}

	public Persona(String nombre) {

		this.nombre = nombre;
	}

	public Persona(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(String nombre, int edad, String direccion) {

		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}

	public void calculo() {

	}

	public String comprobarDireccion(String edad, String nombre, String direccion) {

		String devuelve = edad + " " + nombre + " " + direccion;

		return devuelve;

	}

}
