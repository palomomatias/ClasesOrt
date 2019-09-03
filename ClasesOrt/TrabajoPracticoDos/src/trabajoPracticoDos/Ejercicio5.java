package trabajoPracticoDos;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int contador=0;
		int num1;
		
		do
		{
			System.out.println("ingrese promedio");
			num1=input.nextInt();
			contador++;
		}while(num1<21);
		

			System.out.println(contador);
		input.close();
	}

}
