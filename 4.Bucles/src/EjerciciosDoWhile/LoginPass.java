package EjerciciosDoWhile;

import java.util.Scanner;

public class LoginPass {

	public static void main(String[] args) throws InterruptedException {
		// Crea un programa que pida al usuario su login (un n�mero entero) y su contrase�a (otro n�mero entero). 
		//Se repetir� hasta que el usuario introduzca como login "1809" y como contrase�a "1234". En esta ocasi�n, hazlo con do-while.

		Scanner scan = new Scanner(System.in);
		int password;
		int login;
		 
        Scanner teclado = new Scanner(System.in);
 
        do {
        	System.out.println("Introduzca su usuario: ");
        	login = scan.nextInt();
            System.out.print( "Introduzca su password: " );
            password = teclado.nextInt();    
 
            if (login != 1809)
                System.out.println( "Usuario no v�lido." );
            
            else {
            	if(password != 1234)
            	System.out.print("Contrase�a no v�lida");
            }
            	
        }        
        while (login != 1809 && password != 1234);
    }
}
 
	



