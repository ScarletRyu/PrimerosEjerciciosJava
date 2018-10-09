package EjerciciosWhile;

import java.util.Scanner;

public class Contraseña2 {

	public static void main(String[] args) throws InterruptedException {
		/* Crea un programa que pida al usuario su login (un número entero) y su contraseña (otro número entero). Se repetirá mientras 
		 el usuario introduzca un login distinto de "1809" o una contraseña distinta de "1234".
		 */
		Scanner scan = new Scanner(System.in);
		int login;
		int pass;
		
		System.out.print("Introduce tu usuario: ");
		login = scan.nextInt();
		System.out.print("Introduce una contraseña: ");
		pass = scan.nextInt();
		
		while (login != 1809 || pass != 1234) {
			if (login !=1809 && pass != 1234) {
				System.out.println("El usuario y la pass son incorrectas");
				login = scan.nextInt();
			}
			
			if (login != 1809) {
			System.out.println("El usuario es incorrecto");
			System.out.print("Introduce nuevo usuario:");
			login = scan.nextInt();
			}
		
			if (pass != 1234) {
			
			System.out.println("pass es incorrecta");
			System.out.println("Introduce nueva pass:");
			pass = scan.nextInt();
		}
		
		System.out.println("Logeando....");
		Thread.sleep(2000);
		System.out.println("Ha iniciado sesion");
	
		}
 }
	



}



