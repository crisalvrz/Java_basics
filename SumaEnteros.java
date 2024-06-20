package principal;

import java.util.Scanner;

public class SumaEnteros {

	public static void main(String[ ] args) {
	   int numero1;
	   int numero2;
		 //Objeto Scanner asociado con el teclado
	   Scanner teclado= new Scanner(System.in);

	   System.out.print("Introduce dos números:");
	   numero1=teclado.nextInt();
	   numero2=teclado.nextInt();

	   int suma=numero1+numero2;
	   
	   System.out.printf("El resultado de la suma es %d\n",suma);
	}
	
}
