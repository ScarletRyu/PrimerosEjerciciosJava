package EjerciciosWhile;

import java.util.Scanner;

public class PasswordConIntentos {

	public static void main(String[] args) throws InterruptedException {
		// password con intentos 
		
		
		Scanner scan = new Scanner(System.in);
		int pass;
		int intentos = 0;
		System.out.print("Introduce una contraseņa: ");
		pass = scan.nextInt();
		
		while(pass != 1234 && intentos <= 3) {
			System.out.println("CONTRASEŅA INCORRECTA");
			intentos ++;
			
			System.out.print("Introduce una nueva contraseņa: ");
			pass = scan.nextInt();
			
		
		}
		
		System.out.println("Cerrando....");
		Thread.sleep(2000);
		System.out.println("Finalizado");
	}

}
