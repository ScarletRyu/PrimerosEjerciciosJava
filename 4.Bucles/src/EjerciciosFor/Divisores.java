package EjerciciosFor;

import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		/*Crea un programa que pida al usuario un número entero largo y muestre 
		cuáles son sus divisores (aquellos entre los que se puede dividir, obteniendo como resto 0).
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce numero: ");
		int numero = scan.nextInt();
		
		for (int i=1; i<=numero; i++) {
			if (numero%i == 0) {
				System.out.print(i);
			}
				
			}
		}
	}


