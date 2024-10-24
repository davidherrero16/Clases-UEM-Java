import java.util.Scanner;
public class Ejercicio5_ParOImpar {
    public static void main(String[] args) {

        // Declaración de variables

        Scanner sc = new Scanner(System.in);
        int n1;

    // Pedimos al usuario un número

    System.out.println("¡Hola! Vamos a comprobar si un número es par o impar.");
    System.out.println("Por favor, introduce un número:");
        n1 = sc.nextInt();
       
        // Comprobamos si el número introducido es par mediante el resto de la división
       
        if (n1%2 == 0) {
            System.out.println("El número "+n1+" es un número par.");
        } else {
            System.out.println("El número "+n1+" es un número impar.");
        }

    }
}
