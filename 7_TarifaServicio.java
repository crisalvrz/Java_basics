package principal2;

import java.util.Scanner;

public class TarifaServicio {

	 public static void main(String[ ] args) {
		 char destino; 
		 int edad;

		 Scanner teclado= new Scanner(System.in);

		 System.out.print("Introduce el destino (C/G/S/B): ");
		 destino=teclado.next().charAt(0);
		 System.out.print("Introduce la edad: ");
		 edad=teclado.nextInt();

		 System.out.printf("Tarifa: %f\n",Tarifa(destino,edad));
		 }
	
	  public static double Tarifa(char d, int e) {
		  if ( d=="G" || d=="S" ) {

			  if ( e >= 18 && e <= 64 ) return 30;
			  else return 25;
		  }
		  else {

			  if ( e < 18 || e > 64 ) return 30;
			  else return 35;
		  }
	 }
}
