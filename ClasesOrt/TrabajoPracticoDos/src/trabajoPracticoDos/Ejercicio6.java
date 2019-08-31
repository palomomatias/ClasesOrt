package trabajoPracticoDos;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int numA,numB;
		int acumulador=0;
		int contador;
		System.out.println("ingrese el primer numero");
		numA=input.nextInt();
		System.out.println("ingrese el segundo numero");
		numB=input.nextInt();
		
		if(numA>=0&&numB>=0)
			
		{
			acumulador=0;
			if(numB!=0)
			{
				contador=1;
				while(contador<=numA)
				{
					acumulador=acumulador+numB;
					contador++;
					
				}
			}
		}
		else
		{
			System.out.println("error el numero tiene que ser mayores o igual a cero");
		}
		System.out.println("LA MULTIPLICACION DE: "+numA+" CON "+numB+" ES IGUAL A: "+acumulador);
			
		input.close();
	}

}
