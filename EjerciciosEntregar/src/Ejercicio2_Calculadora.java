import java.util.Scanner;

public class Ejercicio2_Calculadora {
    public static void main(String[] args) {

        // Definimos las variables

        double n1;
        double n2;
        String operation;
        Scanner sc = new Scanner(System.in);


        System.out.println("'¡Hola! Bienvenido a la Calculadora Básica de David. Las operaciones que puede realizar son: sumar, restar, multiplicar, dividir y resto.");

        // Solicitamos la operación a realizar

        System.out.println("Por favor, introduce la operación a realizar:");
            operation = sc.nextLine();

        // Solicitamos los números a usar en la operación

        System.out.println("Por favor, introduce el primer número:");
            n1 = sc.nextDouble();
        System.out.println("Por favor, introduce el segundo número:");
            n2 = sc.nextDouble();

        //Comprobamos la operación y declaramos la suma

        if ((operation.equalsIgnoreCase("sumar")) || operation.equalsIgnoreCase("suma")) {
            double resultadoSuma = n1 + n2;
            System.out.println("El resultado de la suma de "+n1+" + "+n2+" es: "+resultadoSuma); 
        }   else if ((operation.equalsIgnoreCase("restar")) || operation.equalsIgnoreCase("resta")) {

            // Comprobamos qué número es mayor y declaramos la resta

            if (n1>n2) {
                double resultadoResta = n1 - n2;
                System.out.println("El resultado de la resta de "+n1+" más "+n2+" es: " +resultadoResta);
            } else { 
                double resultadoResta = n2 - n1;
                System.out.println("El resultado de la resta de "+n2+" menos "+n1+" es: " +resultadoResta);
            }
        }   else if (operation.equalsIgnoreCase("multiplicar")) {

            // Comprobamos si uno de los números es 0, declaramos la multiplicación y la realizamos

                if (n1 == 0 || n2 == 0) {
                    System.out.println("No se puede hacer la operación ya que el número es 0");
                } else {             
            double resultadoMultiplicacion = n1 * n2;
            System.out.println("El resultado de la multiplicación de "+n1+" por "+n2+" es: "+resultadoMultiplicacion);
            }
        } else if (operation.equalsIgnoreCase("dividir")) {

            // Comprobamos si algún número es 0, declaramos la división y la realizamos

            if (n1 == 0 || n2 == 0) {
                System.out.println("No se puede hacer la operación ya que el número es 0");
            } else {
            double resultadoDivision = n1 / n2;
            System.out.println("El resultado de la divisón de "+n1+" entre "+n2+" es: " +resultadoDivision);
            }
        }  else if (operation.equalsIgnoreCase("resto")) {

            // Comprobamos si hay algún 0, declaramos el resto y realizamos la operación

            if (n1 == 0 || n2 == 0) {
                System.out.println("No se puede hacer la operación ya que el número es 0");
            } else {
            double resultadoResto = n1 % n2;
            System.out.println("El resultado del resto de la división de "+n1+" entre "+n2+" es: " +resultadoResto);
            }
        } else  
            System.out.println("La opción elegida no es válida, por favor, elige entre una de estas opciones y vuelve a intentarlo");
            System.out.print("Las operaciones disponibles son: sumar, restar, multiplicar, dividir y resto.");

        }
    }
