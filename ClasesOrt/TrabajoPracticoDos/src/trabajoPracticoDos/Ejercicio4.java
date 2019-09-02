package trabajoPracticoDos;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num1;
		int num2;
		
		do
		{
			System.out.println("ingrese un numero");
			num1=input.nextInt();
			System.out.println("ingrese un segundo numero mayor que el primero");
			num2=input.nextInt();
		}while(num1>num2);
		
		System.out.println("LA SECUENCIA DE NUNMEROS INCLUYENDO");
		for(int i=num1;i<=num2;i++)
		{
			System.out.println(i);
		}
		System.out.println("LA SECUENCIA DE NUMEROS EXCLUYENDOLOS");
		for(int i=num1+1;i<num2;i++)
		{
			System.out.println(i);
		}
		input.close();
	}

}
