package trabajoPracticoDos;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	int alumnos;
	String [] curso;
	int opcion[];
	int taller=0,fundamentos=0,matematicas=0;
	System.out.println("ingrese la cantidad de alumnos");
	alumnos=input.nextInt();
	curso = new String[alumnos];
	opcion= new int[alumnos];
	for(int i=0;i<alumnos;i++)
	{
		do
			{
			System.out.println("ingrese al curso que pertenece\n A\n B\n C\n D\n");
		curso[i]=input.next();
			}
		while (!curso[i].contentEquals("A")&&!curso[i].contentEquals("B")&&!curso[i].contentEquals("C")&&!curso[i].contentEquals("D"));
		
		do
			{
			System.out.println("Seleccione en que materia necesita apoyo\n 1-TALLER\n 2-FUNDAMENTOS\n 3-MATEMATICAS\n");
		opcion[i]=input.nextInt();
			}
		while(!(opcion[i]>0&&opcion[i]<4));
		switch(opcion[i]){
			case 1:
				taller++;
				break;
			case 2:
				fundamentos++;
				break;
			case 3:
				matematicas++;
				break;	
		}
	}
	
	
	
	
	input.close();
	}

}
