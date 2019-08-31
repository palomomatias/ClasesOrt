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
			//mejorNota=promedio[0];
		//	nombreDeLaMejorNota.charAt(0);
			System.out.println("ingrese nombre del alumno");
			nombre[i]=input.next();
			System.out.println("ingrese su promedio");
			promedio[i]=input.nextInt();
			mejorNota=promedio[0];
			if(mejorNota>promedio[i])
			{
				
				mejorNota=promedio[i];
				nombreDeLaMejorNota=nombre[i];	
			}
		}
			System.out.println(mejorNota+nombreDeLaMejorNota);	
		
		
		input.close();
	}

}
