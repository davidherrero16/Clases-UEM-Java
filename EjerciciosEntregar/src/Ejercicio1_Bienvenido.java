import java.util.Scanner;

public class Ejercicio1_Bienvenido {
    public static void main(String[] args) {

        // Declaración de variables

        String nombre;
        double n1;
        double n2;
        double n3;

		Scanner sc = new Scanner(System.in);

        //Pedimos al usuario el nombre

        System.out.println("¡Hola! Por favor, introduce tu nombre: ");
        nombre=sc.nextLine();
        System.out.println("¡Hola, "+nombre +"!. Ahora vamos a calcular tu nota media.");
        
        //Ahora le pedimos las tres notas

        System.out.println("Por favor, introduce la primera nota: ");
        n1=sc.nextDouble();
        System.out.println("Introduce la segunda nota: ");
        n2=sc.nextDouble();
        System.out.println("Introduce la tercera y última nota: ");
        n3=sc.nextDouble();

        //Calculamos la media

        double notamedia = (n1+n2+n3)/3;

        //Mostramos el resultado
        
        System.out.println("¡Bienvenido "+nombre +"!. Tu nota media es de "+notamedia);
    }
}
