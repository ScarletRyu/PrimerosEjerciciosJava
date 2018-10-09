package EjerciciosFor;

public class Multiplos {

	public static void main(String[] args) {
		// Crea un programa que muestre los números enteros del 0 al 100 que son múltiplos de 6 (el resto al dividir por 6 sea 0).

		for (int i=0; i<=100; i++) {
			if (i%6 == 0) {
			System.out.println(i);
		}
	}

}
}