package principal3;

import java.util.Scanner;

public class DivisoresFor {

	 public static void main(String[ ] args) {
		 try (Scanner teclado = new Scanner(System.in)) {
			int numero;
			 System.out.print("Introduce un entero:");
			 numero=teclado.nextInt();

			 for (int i=1; i<=numero; i++)
			 if ( numero % i == 0)
			 System.out.printf(" %d ",i);
		}
		 }
}
