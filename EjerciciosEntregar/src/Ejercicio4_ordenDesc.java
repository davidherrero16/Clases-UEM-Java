import java.util.Scanner;
public class Ejercicio4_ordenDesc {
    public static void main(String[] args) {

        // Declaración de variables

        Scanner sc = new Scanner(System.in);
        double n1;
        double n2;
        double n3;
        double mayor;
        double intermedio;
        double menor;

        // Pedimos al usuario que introduzca los tres números

        System.out.println("¡Hola! A continuación vamos a ordenar tres números de mayor a menor");
        System.out.println("Por favor, introduce un número:");
        n1 = sc.nextDouble();
        System.out.println("Por favor, introduce otro número:");
        n2 = sc.nextDouble();
        System.out.println("Por favor, introduce el último número:");
        n3 = sc.nextDouble();

        // Comprobaciones para ver qué número es mayor
        if (n1 == n2 && n2 == n3) {
                System.out.println("Los números que has escogido son iguales, " +n1);
            } else {
                if (n1 >= n2 && n1 >= n3) {
                    mayor = n1;
                    if (n2 >= n3) {
                        intermedio = n2;
                        menor = n3;
                    } else {
                        intermedio = n3;
                        menor = n2;
                    }
                } else if (n2 >= n1 && n2 >= n3) {
                    mayor = n2;
                    if (n1 >= n3) {
                        intermedio = n1;
                        menor = n3;
                    } else {
                        intermedio = n3;
                        menor = n1;
                    }
                } else {
                    mayor = n3;
                    if (n1 >= n2) {
                        intermedio = n1;
                        menor = n2;
                    } else {
                        intermedio = n2;
                        menor = n1;
                    }
                }
    
        System.out.println("Los números ordenados de mayor a menos son: "+mayor+", "+intermedio+" y "+menor+".");
    }
    }
}
