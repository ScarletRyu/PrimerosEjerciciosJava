package EjerciciosWhile;

import java.util.Scanner;

public class Contrase�a {

	public static void main(String[] args) throws InterruptedException {
		/* Crea un programa que pida al usuario su contrase�a (un n�mero entero). Se repetir� mientras introduzca una contrase�a distinta de "1234". */

		Scanner scan = new Scanner(System.in);
		int pass;
		
		System.out.print("Introduce una contrase�a: ");
		pass = scan.nextInt();
		
		while(pass != 1234) {
			System.out.println("CONTRASE�A INCORRECTA");
			
			System.out.print("Introduce una nueva contrase�a: ");
			pass = scan.nextInt();
		}
		
		System.out.println("Cerrando....");
		Thread.sleep(2000);
		System.out.println("Finalizado");
	}

}
