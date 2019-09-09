package trabajoPracticoDos;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	int alumnos;
	String [] curso;
	String auxMateria="";
	int mayor[];
	int taller=0;
	int matematicas=0;
	int fundamentos=0;
	
	int aux;
	int opcion[];
	
	System.out.println("ingrese la cantidad de alumnos");
	alumnos=input.nextInt();
	curso = new String[alumnos];
	opcion= new int[alumnos];
	mayor=new int [alumnos];
	
	
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
			curso[i]="TALLER";
			break;
		case 2:
			fundamentos++;
			curso[i]="FUNDAMENTOS";
			break;
		case 3:
			matematicas++;
			curso[i]="MATEMATICAS";
			break;	
	}			
	}
	mayor[0]=taller;
	mayor[1]=fundamentos;
	mayor[2]=matematicas;
		
	
	for(int i=0;i<alumnos-1;i++)
	{
		for(int j = i+1;j<alumnos;j++)
		{
			if(mayor[i]>mayor[j])
			{
				aux=mayor[i];
				mayor[i]=mayor[j];
				mayor[j]=aux;
				auxMateria=curso[i];
				curso[i]=curso[j];
				curso[j]=auxMateria;
				
				
			}
		
		}
	}
	
	
		System.out.println("Hay que darle mas importancia a"+curso[0]);
	
	
	
	input.close();
	}

	
	
	
	}


