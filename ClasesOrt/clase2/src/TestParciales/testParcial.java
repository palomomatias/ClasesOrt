package TestParciales;

import java.util.Scanner;

public class testParcial {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String menu;
		int i=0;
		String categoria[]=new String[99];
		String nombre[]=new String [99];
		int masAntiguo;
		int basico[]=new int[99];
		int antiguedad[]=new int [99];
		int diasVacaciones[]=new int [99];
		double sueldo[]=new double[99];
		String nombreMasAntiguo="";
		String nombreDelSueldoMasAntiguo="";
		do
		{
			System.out.println("Ingrese su nombre");
			nombre[i]=input.next();
			
			do {
				System.out.println("ingrese su categoria");
				categoria[i]=input.next();
			}while(!categoria[i].contentEquals("a")&&!categoria[i].contentEquals("b")&&!categoria[i].contentEquals("c"));
			basico[i]=calcularBasico(categoria[i]);
			do {
				System.out.println("ingrese su antiguedad");
				antiguedad[i]=input.nextInt();
			}
			while(!(antiguedad[i]>0&&antiguedad[i]<51));
			diasVacaciones[i]=calcularDiasVacaciones(antiguedad[i]);
		
			sueldo[i]=calcularSueldoVacaciones(basico[i],antiguedad[i])+calcularSueldoDiasTrabajados(basico[i],diasVacaciones[i]);
			
			i++;

			System.out.println("desea continuar?");
			menu=input.next();

		}while(!(menu.contentEquals("fin")));
		 masAntiguo=antiguedad[0];
		 nombreMasAntiguo=nombre[0];
		double mayorSueldo=sueldo[0];
		System.out.println("Nombre:       Sueldo:");
		for(int j=0;j<i;j++) {
			System.out.println(nombre[j]+sueldo[j]);
			
			if(masAntiguo<antiguedad[j])
			{
				masAntiguo=antiguedad[j];
				nombreMasAntiguo=nombre[j];
			}
			if(mayorSueldo<sueldo[j])
			{
				mayorSueldo=sueldo[j];
				nombreDelSueldoMasAntiguo=nombre[j];
			}
			
			
			
		}
		System.out.println(i);
		System.out.println(nombreMasAntiguo+""+masAntiguo);
		System.out.println(nombreDelSueldoMasAntiguo+""+mayorSueldo);
		

		
		
		input.close();
	}
	
	
	private static int calcularBasico (String test) {
		int resultado=0;
		switch(test)
		{
		case "a":
			resultado=20000;
			break;
		case "b":
			resultado=30000;
			break;
		case "c":
			resultado=40000;
			break;
		}
		return resultado;
	}
	static int calcularDiasVacaciones(int numero)
	{
		int resultado=0;
		if(numero>=0&&numero<6) {
			resultado=14;
		}
		else if(numero>=6&numero<11) {
			resultado=16;
		}else if (numero>=11&&numero<51)
		{
			resultado=28;
		}
		return resultado;
		
		
	}
	
	static double calcularSueldoDiasTrabajados(int basico,int vacaciones)
	{
		double resultado=0;
		resultado=(double)(basico/30)*(double)(30-vacaciones);
		return resultado;
		
	}
	static double calcularSueldoVacaciones(int basico,int numero)
	{
		double resultado=0;
		resultado=(double)(basico/25)*calcularDiasVacaciones(numero);
		
		return resultado;
	}
}












