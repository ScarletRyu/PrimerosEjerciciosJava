package EjerciciosFor;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario un n�mero entero largo y diga si es primo (si s�lo es divisible entre 1 y �l mismo).

		Scanner obtenerNumero = new Scanner(System.in);
        int contador,I,numero;
 
        System.out.print("Ingresa un numero: ");
        numero = obtenerNumero.nextInt();
 
        contador = 0;
 
        for(I = 1; I <= numero; I++)
        {
            if((numero % I) == 0)
            {
                contador++;
            }
        }
 
        if(contador <= 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
}
