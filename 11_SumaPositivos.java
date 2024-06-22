package principal3;

import java.util.Scanner;

public class SumaPositivos {

	 public static void main(String[ ] args) {

		 Scanner teclado= new Scanner(System.in);
		 int numero;
		 int suma=0;
		 System.out.print("Secuencia de enteros positivos :");
		 numero=teclado.nextInt();
		 while ( numero >= 0 ) {
		 suma += numero;
		 numero=teclado.nextInt();
		 }

		 System.out.printf("Su suma es %d\n",suma);
		 }
	
}
