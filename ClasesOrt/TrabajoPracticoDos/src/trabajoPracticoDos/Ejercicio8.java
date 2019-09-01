package trabajoPracticoDos;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		final int alumnos=10;
		String nombre[]=new String[alumnos];
		int promedio[]=new int[alumnos];
		int mejorNota=0;
		String nombreDeLaMejorNota = null;
		
		for(int i=0;i<alumnos;i++)
		{
			System.out.println("ingrese nombre del alumno");
			nombre[i]=input.next();
			do
				{
				System.out.println("ingrese su promedio");
			promedio[i]=input.nextInt();
				}
			while(promedio[i]<0||promedio[i]>11);
		}
		mejorNota=promedio[0];//Ejecutar afuera del for si no te tira cualquier resultado
		nombreDeLaMejorNota=nombre[0];//Ejecutar afuera del for si no te tira cualquier resultado
		for (int i=0;i<promedio.length;i++)
		{
			
			if(mejorNota<promedio[i])//para buscar el menor promedio solo invertir a mayor
			{
				
				mejorNota=promedio[i];
				nombreDeLaMejorNota=nombre[i];	
			}
			
			
		}
			
			System.out.println("El MEJOR PROMEDIO ES\n"+nombreDeLaMejorNota+" Con un promedio de: "+mejorNota);	
		
		
		input.close();
	}

}
