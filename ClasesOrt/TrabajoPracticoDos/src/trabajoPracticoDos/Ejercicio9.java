package trabajoPracticoDos;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int numeros[]=new int [10];
		int suma=0;
		for(int i=0;i<5;i++)
		{
			System.out.println("ingrese el primer numero");
			numeros[i]=input.nextInt();
			suma=suma+numeros[i];
			System.out.println("ingrese el segundo numero");
			numeros[i]=input.nextInt();
			suma=suma+numeros[i];
			System.out.println("ingrese el segundo el tercer numero");
			numeros[i]=input.nextInt();
			suma=(suma+numeros[i])/3;
		System.out.println("El promedio total es "+suma);
		suma=0;
		}
		
		
			
		input.close();
	}

}
