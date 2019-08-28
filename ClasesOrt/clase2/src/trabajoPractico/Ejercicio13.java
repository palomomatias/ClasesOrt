package trabajoPractico;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		final int MENOS_DE_CUARENTA_HORAS=16;
		final int MAS_DE_CUARENTA_HORAS=20;
		int horas;
		int total;
		int horasExtra;
		System.out.println("INGRESE LA CANTIDAD DE HORAS TRABAJADAS");
		horas=input.nextInt();
		if (horas<40)
		{
			total=horas*MENOS_DE_CUARENTA_HORAS;
			System.out.println("SALARIO CORRESPONDIENTE"+total);	
		}
		else if (horas>40)
		{
			horasExtra= horas-40;
			total= (horas*MENOS_DE_CUARENTA_HORAS)+(horasExtra*MAS_DE_CUARENTA_HORAS);
			System.out.println("SUELDO TOTAL"+total);
		}
		
		input.close();
	}

}