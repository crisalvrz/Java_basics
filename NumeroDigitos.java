package principal3;

import java.util.Scanner;

public class NumeroDigitos {

		 public static void main(String[ ] args) {

		 Scanner teclado= new Scanner(System.in);

		 int numero;


		 System.out.print("Introduce un entero:");
		 numero=teclado.nextInt();

		 int dıgitos=0;
		 do {
		 dıgitos++;
		 numero /= 10;
		 }
		 while ( numero != 0 );

		 System.out.printf("Tiene %d dígitos\n",dıgitos);
		 }

}
