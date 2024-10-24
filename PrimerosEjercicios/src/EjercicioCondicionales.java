import java.util.Scanner;

public class EjercicioCondicionales {

	public static void main(String[] args) {
		// Declaración de variables
		int edad;
		Scanner sc = new Scanner(System.in);
		//Vamos a preguntar por la edad para saber si podemos votar o no.
		System.out.println("Dime tu edad: ");
		edad = sc.nextInt();
		
		if(edad>=18) {
			if(edad>18 && edad<=30) {
				System.out.println("Perteneces a generación Z");
			}
			else {
				System.out.println("Perteneces a la generación H");
			}
			System.out.println("Enhorabuena, puedes votar");
		}
		else {
			System.out.println("Perteneces a los bebés");
			System.out.println("Vaya, no puedes votar, a ver si crecemos");
		}
		
		System.out.println("Prueba condicional simple");
		

	}

}
