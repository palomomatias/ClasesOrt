package trabajoPractico;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int hora;
		final int HORA_APERTURA =10;
		final int HORA_CIERRE =18;
		System.out.println("Ingresa la hora");
		hora=input.nextInt();
		//test git
		while (hora>24 || hora<0)
		{
			System.out.println("ingrese una hora valida");
			hora=input.nextInt();
		}
		if (hora>=HORA_APERTURA&&hora<=HORA_CIERRE)
		{
			
			System.out.println("Esta abiero");
		}
		else
		{
			System.out.println("Esta Cerrado");
		}
			
		input.close();
	}

}
