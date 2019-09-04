package trabajoPracticoDos;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int contador=0;
		int num1;
		float promedio=0;
		int acumulador=0;
		
		while(promedio<21)
		
		{
			System.out.println("ingrese numero");
			num1=input.nextInt();
			contador++;
			acumulador=acumulador+num1;
			promedio=(float)acumulador/contador;
			System.out.println("promedio es: "+promedio);
		}
		System.out.println("supero el promedio mayor a 20");

			
		input.close();
	}

}
