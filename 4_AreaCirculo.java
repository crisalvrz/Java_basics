package principal;

public class AreaCirculo {

import java.util.Scanner;

	 public static void main(String[ ] args) {
	 final double PI=3.1416;
	 double radio; 

	 Scanner teclado= new Scanner(System.in);

	 System.out.print("Introduce el radio: ");
	 radio=teclado.nextDouble();
	 double area;
	 area=radio*radio*PI;

	 System.out.printf("El area es %f\n", area);
     }
}
