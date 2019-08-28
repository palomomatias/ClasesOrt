package trabajoPractico;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int suma;
		num1 = (int) (Math.random() * 6) + 1;
		num2 = (int) (Math.random() * 6) + 1;
		num3 = (int) (Math.random() * 6) + 1;
		suma=num1+num2+num3;
		if (suma==18)
		{
			System.out.println("EXCEKEBTE");
		}
		else if ((num1+num2)==12||(num1+num3==12)||(num3+num2)==12)
		{
			System.out.println("MUY BIEN");
		}
		else if (num1==6||num2==6||num3==6)
		{
			System.out.println("BUENI");
		}
		else
		{
			System.out.println("NO SACASTE NINGUN 6");
		}
		
		input.close();
	}

}