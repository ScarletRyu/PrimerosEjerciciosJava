package EjerciciosBreakContinue;

public class NumerosMenos15 {

	public static void main(String[] args) {
		// Crea un programa que muestre los números del 1 al 20, excepto el 15, usando "for" y "continue"

		int i;
        System.out.println( "Empezamos..." );
        for ( i=1 ; i<=20 ; i++ ) {
             
             if (i==15) continue;
             System.out.println(i);
        }
        System.out.println( "Terminado" );
    }

 
		
	

}
