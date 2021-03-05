package ProyectoJava;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String text = "invierno";
		String letras = "abcdefghijkmnlñopqrstuvwxyz";
		String cifrado = "";
		
		int n = 8;
		
		
		for (int i = 0; i < text.length(); i++) {
			
			
			for (int j = 0; j < letras.length(); j++) {
				
				
				if (text.charAt(i) == letras.charAt(j)) {
					
					cifrado = cifrado + letras.charAt((j+n) % letras.length());
					
				}
				
				
			}
			
			
			
		}
		
		System.out.println(cifrado);
		
	}

}
