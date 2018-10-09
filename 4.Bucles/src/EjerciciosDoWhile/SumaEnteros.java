package EjerciciosDoWhile;

import java.util.Scanner;

public class SumaEnteros {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos números enteros y muestre su suma. Se repetirá hasta que los dos sean 0. Emplea do-while.

		
		int numero1;
		int numero2;
		int suma = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Introduce el primer numero: ");
			numero1 = scan.nextInt();
			System.out.println("Introduce el segundo numero: ");
			numero2 = scan.nextInt();
			
			System.out.println("La suma de los numeros es: " +suma);
			suma++;
		}while(numero1 != 0 && numero2 != 0);
		System.out.println("Fin");

			
	}
	
	

}
