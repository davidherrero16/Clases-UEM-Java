import java.util.Scanner;

public class Ejercicio3_mayorMenorIgual {
    public static void main(String[] args) {

        // Declaración de variables

        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;

        // Pedimos al usuario los dos números

        System.out.println("¡Hola! A continuación vamos a comprobar qué número es mayor o menor.");
        System.out.println("Por favor, introduce un número:");
        n1 = sc.nextInt();
        System.out.println("Por favor, introduce otro número:");
        n2 = sc.nextInt();

            //Comprobamos los números y mostramos los resultados
            
        if (n1>n2) {
            System.out.println("El número mayor es: " +n1);
            System.out.println("El número menor es: " +n2);
            } else if (n2>n1) {
                System.out.println("El número mayor es: " + n2);
                System.out.println("El número menor es: " + n1);
            } else
                System.out.println("El número "+n1+" y el número "+n1+" son iguales.");
    }
}
