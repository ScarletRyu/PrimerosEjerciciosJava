package EjerciciosFor;

import java.util.Scanner;

public class MillonesDeMultiplos {

	public static void main(String[] args) {
		// Crea un programa que muestre los n�meros enteros entre 0 y el que introduzca 
		//el usuario que sean m�ltiplos de 3 (el resto al dividir por 3 es 0) y a la vez m�ltiplos de 7 (�dem).

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce limite de contador: ");
		int contador = scan.nextInt();
		
		for (int i=0; i<=contador; i++) {
			if (i%3 == 0 &&  i%7 == 0) {
				
			System.out.println(i);
		}
	}

}
}