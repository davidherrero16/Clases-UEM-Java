import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		//Declaración de variables
		double op1, op2, resta;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el primer numero: ");
		op1=sc.nextDouble(); // Lectura de valor int
		/*sc.next(); // Lectura de cadena de texto hasta que encuentra un espacio
		sc.nextLine(); // Lectura de cadena de texto entera
		sc.nextDouble(); // Lectura de valor double*/
		System.out.println("Dime el segundo numero: ");
		op2=sc.nextDouble();
	
		
		
		System.out.println("La suma de "+op1+" + "+op2+" es "+(op1+op2));
		resta = op1 - op2;
		System.out.println("La resta de "+op1+" menos "+op2+" es "+(op1-op2));
		System.out.println("La multiplicación de "+op1+" por "+op2+" es "+(op1*op2));
		System.out.println("La división de "+op1+" entre "+op2+" es "+(op1/op2));
		System.out.println("El resto de "+op1+" y "+op2+" es "+(op1%op2));
		
		op1 = op1+7;
		op1 +=7;

	}

}


