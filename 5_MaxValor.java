package principal2;

import java.util.Scanner;

public class MaxValor {

	public static double Max2(double a, double b) {
		 if ( a > b ) return a;
		 else return b;
		 }
	
	public static void main(String[ ] args) {

		 double num1, num2;

		 try (Scanner teclado = new Scanner(System.in)) {
			System.out.print("Introduce dos reales:");
			 num1=teclado.nextDouble();
			 num2=teclado.nextDouble();
		}

		 System.out.printf("Maximo: %f\n" ,Max2(num1,num2));
		}
}
