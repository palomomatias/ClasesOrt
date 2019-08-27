package trabajoPractico;
import java.util.Scanner;
public class EjercicioSeis {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int num1;
		

		System.out.println("ingrese un numero mayor a cero");
		num1=input.nextInt();
		while(num1<0)
				{
			System.out.println("Reingrese un numero mayor a cero");
			num1=input.nextInt();
				}
		if(num1%2==1)
		{
			System.out.println("el numero es impar");
		}
		else
		{
			System.out.println("el numero es par");
		}
		input.close();
	}

}