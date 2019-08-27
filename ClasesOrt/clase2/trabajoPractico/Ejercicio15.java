package trabajoPractico;
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean estaEnA=false;
		boolean estaEnB=false;
		boolean estaEnAmbos=false;
		boolean noEstaEnNinguno=false;
		int num1;
		System.out.println("ingrese un numero");
		num1=input.nextInt();
		
		if (num1%2==0)
		{
			estaEnA=true;
		}
		if (num1>=0&&num1<10)
		{
			estaEnB=true;
		}
		if (estaEnA==true&&estaEnB==true)
		{
			estaEnAmbos=true;
		}
		if (estaEnA==false&&estaEnB==false)
		{
			noEstaEnNinguno=true;
		}
		if (noEstaEnNinguno==true)
		{
			System.out.println("NO ES PAR Y NO TIENE UN SOLO DIGITO");
		}
		if (estaEnAmbos==true)
		{
			System.out.println("EL NUNERO ES PAR Y DE UN SOLO DIGITO");
		}
		else if (estaEnA==true)
		{
			System.out.println("EL NUMERO ES PAR");
		}
		else if(estaEnB==true)
		{
			System.out.println("EL NUMERO ES DE UN SOLO DIGITO");
			
		}
		input.close();
	}

}