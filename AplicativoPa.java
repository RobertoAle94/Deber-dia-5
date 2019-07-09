import java.util.Scanner;

public class AplicativoPa{

	public static void main (String []args){

		int num;

		Scanner lee= new Scanner(System.in);

		System.out.println("Ingrese el numero: ");
			num=lee.nextInt();

		Pares obj1= new Pares(num);
		obj1.Calculo();
	}
}