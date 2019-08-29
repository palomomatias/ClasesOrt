package trabajoPracticoDos;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int numeroDeVentas=0;
		int importe[];
		int suma = 0;
		
		System.out.println("ingrese el numero de ventas");
		numeroDeVentas=input.nextInt();
		importe=new int [numeroDeVentas];
		for (int i=0;i<numeroDeVentas;i++)
		{
			System.out.println(+(i+1)+"Ingrese el importe");
			importe[i]=input.nextInt();	
			suma+=importe[i];
		}
		System.out.println(suma);

		input.close();
	}

}
