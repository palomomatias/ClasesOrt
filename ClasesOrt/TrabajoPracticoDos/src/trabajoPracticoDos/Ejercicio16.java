package trabajoPracticoDos;

import java.util.Scanner;

public class Ejercicio16 {
public static Scanner input= new Scanner(System.in);
public static int cantidadDePersonas;
public static int contClasico=0;
public static int contKosher=0;
public static int contCeliaco=0;
public static int contLight=0;
public static int resultado=0;
public static int acumClasico=0;
public static int acumKosher=0;
public static int acumLight=0;
public static int acumCeliaco=0;


public static void main(String[] args) {
		
		String menuDelSistema;
		int totalPersonaMenu=0;
		int restante;
		int total=0;
		int bebidas;
		int comida=0;
		menuDelSistema=ingresoDelSistema();
		String menu;
		if(menuDelSistema.contentEquals("s")) {
			cantidadDePersonas=pedirNroPersona();
			restante=cantidadDePersonas;
			do
				{
				menu=pedirMenu();
				if(!menu.contentEquals("fin")) {	
				totalPersonaMenu=pedirInvitadosMenu(restante);
				restante=restante-totalPersonaMenu;	
				cuentaDeMenu(menu,totalPersonaMenu);
				}
				}
			while(!menu.contentEquals("fin"));
			comida=costoDeComida();
			bebidas=costoBebidas(cantidadDePersonas);
			total=costoTotal(bebidas,comida);
			System.out.println("usted ha invitado "+cantidadDePersonas+" personas");
			System.out.println("Clasico "+contClasico+" 300");
			System.out.println("Celiaco "+contCeliaco+" 310");
			System.out.println("Kosher "+contKosher+" 430");
			System.out.println("Light "+contLight+" 290");
			System.out.println("El costo de la comida es "+comida);
			System.out.println("El costo de las bebidas es "+bebidas);
			System.out.println("El costo total es de "+total);
		}
		
		
	}
public static int costoBebidas(int personas)
{
	int total;
	total=personas*30;
return total;
}

public static int costoTotal(int bebidas,int comida)
{
int total;
total=comida+bebidas;
return total;

}



public static int costoDeComida()
{
	int total;
	acumClasico=contClasico*300;
	acumLight=contLight*290;
	acumCeliaco=contCeliaco*310;
	acumKosher=contKosher*460;
	total=acumClasico+acumLight+acumCeliaco+acumKosher;
	return total;
}
	
public static void cuentaDeMenu(String menu,int totalPersonaMenu)
{	
	
	switch (menu)
	{
	case "clasico":
		contClasico=totalPersonaMenu+contClasico;
		break;
	case "celiaco":
		contCeliaco=totalPersonaMenu+contCeliaco;
		break;
	case "kosher":
		contKosher=totalPersonaMenu+contKosher;
	case "light":
		contLight=totalPersonaMenu+contLight;
		break;
	}
	

}
public static int pedirInvitadosMenu(int restante)
{
	int aux;
	System.out.println("ingrese el numero de personas para ese menu");
	aux=input.nextInt();
	while(restante<aux)
	{
		System.out.println("Error es mayor el numero\n reingrese el numero de personas para ese menu");
		aux=input.nextInt();
	
	}
	return aux;

}
public static String pedirMenu()
{
	String menu;

	System.out.println("clásico/celiaco/kosher/light/fin para finalizar");
		menu=input.next();	
	while (!menu.contentEquals("clasico")&&!menu.contentEquals("celiaco")&&!menu.contentEquals("kosher")&&!menu.contentEquals("light")&&!menu.contentEquals("fin"))
	{
		System.out.println("error\nclásico/celiaco/kosher/light/fin para finalizar");
		menu=input.next();	
	}
	return menu;

}
public static String ingresoDelSistema()
{
	String menu;
	do {
		
		System.out.println("Desea ingresar al sistema de catering, aprete s o n ");
		menu=input.next();
		
	}
	while(!menu.contentEquals("s")&&!menu.contentEquals("n"));
return menu;

}
public static int pedirNroPersona()
{
	
	int cantidadDePersonas;
	do {
		System.out.println("ingrese la cantidad de persona");
		cantidadDePersonas=input.nextInt();
	}
	while(cantidadDePersonas<0);
return cantidadDePersonas;
}
}
