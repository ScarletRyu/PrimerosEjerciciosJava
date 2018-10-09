package EjerciciosWhile;

import java.util.Scanner;

public class Contraseña {

	public static void main(String[] args) throws InterruptedException {
		/* Crea un programa que pida al usuario su contraseña (un número entero). Se repetirá mientras introduzca una contraseña distinta de "1234". */

		Scanner scan = new Scanner(System.in);
		int pass;
		
		System.out.print("Introduce una contraseña: ");
		pass = scan.nextInt();
		
		while(pass != 1234) {
			System.out.println("CONTRASEÑA INCORRECTA");
			
			System.out.print("Introduce una nueva contraseña: ");
			pass = scan.nextInt();
		}
		
		System.out.println("Cerrando....");
		Thread.sleep(2000);
		System.out.println("Finalizado");
	}

}
