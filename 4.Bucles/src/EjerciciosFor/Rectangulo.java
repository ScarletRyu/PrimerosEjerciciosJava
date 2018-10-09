package EjerciciosFor;

import java.util.Scanner;

public class Rectangulo {

	public static void main(String[] args) {
		/*
		Crea un programa que pida dos números de tipo byte al usuario y escriba en pantalla un rectángulo 
		formado por asteriscos, que tendrá como alto el primer número y como ancho el segundo número.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce alto del rectangulo: ");
		int alto  = scan.nextInt();
		
		System.out.println("Introduce ancho del rectangulo: ");
		int ancho = scan.nextInt();
		
		for (int row=1; row<=alto; row++) {
			for (int col=1; col<=ancho; col++) {
				if (row==1 || row==alto || col==1 || col==ancho) {
					System.out.println("*");
				}
					
				}
			}
		}
	}


