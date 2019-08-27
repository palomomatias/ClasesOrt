package trabajoPractico;
import java.util.Scanner;
public class EjercicioSiete {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		//int max;
		System.out.println("ingrese el primero numero");
		num1=input.nextInt();
		System.out.println("ingrese el segundo numero");
		num2=input.nextInt();
		System.out.println("ingrese el tercer numero");
		num3=input.nextInt();
		if(num1==num2&&num2==num3)
		{
			System.out.println("los numeros son iguales");
		}
		
		else if(num1>num2&&num1>num3)
		{
			System.out.println("El numero mayor es "+num1);
		}
		else if(num2>num1&&num2>num3)
		{
			System.out.println("El numero mayor es "+num2);
		}
		else
		{
			System.out.println("El numero mayor es "+num3);
		}
		
		input.close();
	}

}