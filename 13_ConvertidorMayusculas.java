package principal3;

import java.util.Scanner;

public class ConvertidorMayusculas {
	 public static void main(String[ ] args) {

		 Scanner teclado= new Scanner(System.in);
		 System.out.print("Escribe aquí: ");

		 String cadena = teclado.next();
		 char[ ] mayusculas = cadena.toCharArray();


		 for (int i=0; i<mayusculas.length; i++) {
		 if (mayusculas[i] >= 'a' && mayusculas[i] <= 'z')

		 mayusculas[i] = (char) (mayusculas[i] -32);
		 }

		 System.out.println(mayusculas);
		 }

}
