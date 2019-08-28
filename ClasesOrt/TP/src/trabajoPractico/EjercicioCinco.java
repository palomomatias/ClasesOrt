package trabajoPractico;
import java.util.Scanner;
public class EjercicioCinco {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int num1;
		int num2;
		double resultado;
		System.out.println("ingrese un numero");
		num1=input.nextInt();
		System.out.println("ingrese otro numero");
		num2=input.nextInt();
		if(num2==0)
		{
			System.out.println("no se puede dividir por cero");
		}
		else
		{
			resultado=(double)num1/num2;
			System.out.println( num1 + " / " + num2 + " = " + resultado);
		}
		input.close();
	}

}