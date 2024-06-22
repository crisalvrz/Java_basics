package principal3;

import java.util.Scanner;

public class SumaParesWhile {

	 public static void main(String[ ] args) {

		 Scanner teclado= new Scanner(System.in);

		 int número;


		 System.out.print("Introduce un entero: ");
		 número=teclado.nextInt();

		 int par=2;
		 int suma=0; 
		 while ( par <= número ) {
		 suma+=par;
		 par+=2;
		 }
	
		 System.out.printf("La suma es %d\n",suma);
		 }
}
