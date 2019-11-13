package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestNumero {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Integer> li_numero=new ArrayList<Integer>();
		double proPar;
		int numeros;
		double promedio=0;
		for (int i=0;i<10;i++)
		{
			
			numeros=pedirNumeros();
			li_numero.add(new Integer(numeros));
			
		}
		for (int i=0;i<10;i++)
		{
		System.out.println(li_numero.get(i).toString());
		}
		promedio=calcPromedio(li_numero);
		System.out.println(promedio);
		proPar=calcPromedioPar(li_numero);
		System.out.println(proPar);
	}
	
	public static int pedirNumeros()
	{	
		int num;
		System.out.println("ingrese numeros mayor a 0");
		num=input.nextInt(); 
		while (num<0)
		{
			System.out.println("Error reingrese numeros mayor a 0");
			num=input.nextInt();
			
		}
		return num;
	}
	public static double calcPromedio(ArrayList<Integer> lista)
	{
		double acu=0;
		double total;
		for(int i=0;i<10;i++)
		{
			acu=lista.get(i)+acu;
			
		}		
		total=acu/10;
		return total;
		
	}
	
	public static double calcPromedioPar(ArrayList<Integer> lista)
	{
		double acu=0;
		double total;
		int i;
		for(i=0;i<10;i++)
		{
			if(i%2==0){
			acu=lista.get(i)+acu;
			}
		}		
		total=acu/i;
		return total;
		
	}
}
