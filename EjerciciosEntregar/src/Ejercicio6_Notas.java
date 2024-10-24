import java.util.Scanner;

public class Ejercicio6_Notas {
    public static void main(String[] args) {
        // Declaración de variables
        
        Scanner sc = new Scanner (System.in);
        int n1;
        // Aquí pongo int y no double ya que entiendo del enunciado que no se pueden poner notas con decimales

        // Pedimos al usuario que introduzca un número

        System.out.println("¡Hola! Vamos a comprobar la nota que has sacado.");
        System.out.println("Por favor, introduce tu nota del 0 al 10:");
        n1 = sc.nextInt();
        if (n1 >= 0 && n1 < 5) {
                System.out.println("Tu nota es INSUFICIENTE");
            } else if (n1 == 5) {
                System.out.println("Tu nota es SUFICIENTE");              
            } else if (n1 == 6) {
                System.out.println("Tu nota es BIEN");                
            } else if (n1 == 7 || n1 == 8) {
                System.out.println("Tu nota es NOTABLE");                
            } else if (n1 == 9) {
                System.out.println("Tu nota es SOBRESALIENTE");
            } else if (n1 == 10) {
                System.out.println("Tu nota es MATRICULA DE HONOR");
            } else {
                System.out.println("La nota introducida no es válida, por favor, introduce un número del 0 al 10.");
            }
}
}
