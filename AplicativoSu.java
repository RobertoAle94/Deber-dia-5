import java.util.Scanner;

public class AplicativoSu {

    public static void main(String[] args) {
        
        int num;
        int sumapar=0;
        int sumaimpar=0; 

	Scanner lee = new Scanner(System.in);

        System.out.println ("Introduce numero: ");
		num = lee.nextInt(); 

        for(int ind=1;ind<=num;ind++) {
            if(ind%2==0) {
                sumapar+=ind;
            }
            else {
                sumaimpar+=ind;
            }	 
        }
        System.out.println ("La suma de los pares es: "+sumapar);
        System.out.println ("La suma de los impares es: "+sumaimpar); 
	Sumar obj1=new Sumar(num, sumapar, sumaimpar);
	obj1.imprimirDatos();
	
 }	 
}