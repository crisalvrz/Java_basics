package principal;
import java.util.Scanner;

public class Media {
	public static void main(String[ ] args) {
		 int numero1;
		 int numero2;

		 Scanner teclado= new Scanner(System.in);

		 System.out.print("Introduce dos números: ");
		 numero1=teclado.nextInt();
		 numero2=teclado.nextInt();

		 int media;
		 media=(numero1+numero2)/2;

		 System.out.printf("Su media es %d\n",media);
		 }
}
