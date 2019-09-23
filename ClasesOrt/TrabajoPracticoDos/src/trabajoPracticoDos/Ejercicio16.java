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
	public static void main(String[] args) {
		
		String menuDelSistema;
		int totalPersonaMenu;
		int restante;
		menuDelSistema=ingresoDelSistema();
		String menu;
		if(menuDelSistema.contentEquals("s")) {
			cantidadDePersonas=pedirNroPersona();
			restante=cantidadDePersonas;
			do
				{
				menu=pedirMenu();
				totalPersonaMenu=pedirInvitadosMenu(restante);
				restante=restante-totalPersonaMenu;				
				}
			while(!menu.contentEquals("fin"));
		
		}
		
	}

public static void cuentaDeMenu(String menu)
{	
	int personasQueElegieronMenu;
	int aux;
	do{System.out.println("ingrese la cantidad de personas que eligieron ese menu");
	personasQueElegieronMenu=input.nextInt();
	}
	while(personasQueElegieronMenu>cantidadDePersonas);
	resultado=cantidadDePersonas-personasQueElegieronMenu;
	 
		 
		 
		 
	switch (menu)
	{
	case "clasico":
		contClasico++;
		break;
	case "celiaco":
		contCeliaco++;
		break;
	case "kosher":
		contKosher++;
	case "light":
		contLight++;
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
