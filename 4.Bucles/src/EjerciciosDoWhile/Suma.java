package EjerciciosDoWhile;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		// Crea un programa que muestre la "tabla de multiplicar del 5", usando "do-while"
			Scanner scan = new Scanner(System.in);
			int i=1, r;
			
			System.out.println("Ingrese el numero de la tabla de multiplicar");
			int n = scan.nextInt();
			
			do {
				r= n*i;
				System.out.println(n+ "*" +i+ "=" +r+ "");
				i=i+1;
			
			}while(i <= 10); {
				
				
		}

	}
}