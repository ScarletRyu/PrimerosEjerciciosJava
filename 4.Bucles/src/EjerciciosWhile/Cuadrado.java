package EjerciciosWhile;

import java.util.Scanner;

public class Cuadrado {

	public static void main(String[] args) throws InterruptedException {
		/* Crea un programa que pida al usuario un número entero y muestre su cuadrado. 
		 * Se repetirá mientras el usuario introduzca un número distinto de cero.
		 */
		
		
		/* Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.print("Ingrese un numero: ");
		numero = scan.nextInt();
		
		while (numero > 0) {
			
		numero = (numero * numero);
		System.out.print("El resultado es " +numero);
		break;
		}
		
		
*/

		Scanner tec = new Scanner(System.in);
		
int n, base;
System.out.println("Ingrese la base: ");
base = tec.nextInt();
System.out.println("Ingrese el exponente");
n = tec.nextInt();
while(base != 0) {
int resultado = (int) Math.pow(base, n);
System.out.println(base + " elevado a la " + n + " es igual a " + resultado);
System.out.println("Dime otro numero: ");
base = tec.nextInt();


	}
System.out.println("Cerrando....");
Thread.sleep(2000);
System.out.println("Finalizado");
}
}
