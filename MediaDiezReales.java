package principal3;

import java.util.Scanner;

public class MediaDiezReales {

	 public static void main(String[ ] args) {

		 Scanner teclado= new Scanner(System.in);

		 double numero;

		 double suma=0;
		 System.out.print("Introduce 10 números reales:");
		 for (int i=1; i<=10; i++) {
		 numero=teclado.nextDouble(); //leemos el siguiente
		 suma += numero; //sumamos
		 }
		 System.out.printf("Su media es %f\n",suma/10);
		 }
}
