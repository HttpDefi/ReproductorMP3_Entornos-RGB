package EjercicioMP3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// ARRAYLIST DE LISTAS
		ArrayList<Lista> misListas = new ArrayList<Lista>();
	
		// REPRODUCTOR
		Reproductor MP3 = new Reproductor("Ruben", "Samsung", "XZP", LocalDate.now(), misListas);
				
		// LISTAS
		Lista miLista = new Lista("Mucho rap","Rap");
		Lista listaSergio = new Lista("Bailar o morir", "Musica clásica");
		
		// AÑADIMOS LISTAS AL ARRAYLIST DE LISTAS 
		misListas.add(miLista);
		misListas.add(listaSergio);
		
		// CANCIONES
		Cancion unaCancion = new Cancion();
		Cancion otraCancion = new Cancion();
		
	}

}
