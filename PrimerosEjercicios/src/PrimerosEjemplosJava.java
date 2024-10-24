
public class PrimerosEjemplosJava {

	public static void main(String[] args) {
		// Comentarios de una sola línea
		/*
		 * Comentarios en varias líneas
		 */
		
		// Declaración de variables y constantes
		int numero = 9; // Variable de tipo entero. Declaración
		int resultado;
		long nota; // Variable de tipo entero largo.
		float numeroDecimales; // Variable de tipo decimal.
		double numDecimales; // Variable de tipo decimal largo.
		
		final double PI = 3.1416;
		
		String apellidos="Herrero"; // Variable de tipo cadena de texto.
		char letraDNI='X'; // Variable de tipo letra.
		
		boolean valor = true;
		
		// Inicialización
		System.out.println("El valor de numero es " +numero);
		numero = 7;
		System.out.println("Hola "+apellidos+" El nuevo valor de numero es "+numero);
		
		
		//Asignación del valor
		resultado = numero+numero;
		resultado++;

		

		System.out.println("Resultado es "+resultado);
	}

}
