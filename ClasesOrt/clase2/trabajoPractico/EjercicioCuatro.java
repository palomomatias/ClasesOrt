package trabajoPractico;
import java.util.Scanner;
public class EjercicioCuatro {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("ingrese un numero");
		num1=input.nextInt();
		System.out.println("ingrese otro numero");
		num2=input.nextInt();
		System.out.println("La suma entre " + num1 + " y " + num2 + " da como resultado " + (num1 + num2));
		input.close();
	}

}
