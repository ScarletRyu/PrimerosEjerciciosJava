package EjerciciosFor;

import java.util.Scanner;

public class CuadradoHueco {

	public static void main(String[] args) {
		// Crea un programa que pida un número de tipo byte al usuario y escriba en pantalla un cuadrado formado por asteriscos,
		//que tendrá como alto y ancho la cantidad introducida por el usuario.

	
		
		Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el numero de asteriscos que tendra cada lado del  cuadrado: ");
        int lado = teclado.nextInt();
        teclado.close();
 
        System.out.println();
        for(int row=1; row<=lado; row++){
            for(int col=1; col<=lado; col++){
                if(row==1 || row==lado || col==1 || col==lado){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


}