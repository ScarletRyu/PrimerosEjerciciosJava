package EjerciciosWhile;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		/* Tabla de multiplicar el 5 con While */
		Scanner scan = new Scanner(System.in);

		int i=1, r;
		System.out.println("Ingrese el numero de la tabla de multiplicar");
		int n = scan.nextInt();
		while(i <= 10) {
			
			r= n*i;
			System.out.println(n+ "*" +i+ "=" +r+ "");
			i=i+1;
		}
	}

}
