package TestParciales;

import java.util.Scanner;

public class testParcial {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String menu;
		int i=0;
		String categoria[]=new String[99];
		String nombre[]=new String [99];
		int basico[]=new int[99];
		int antiguedad[]=new int [99];
		int diasVacaciones[]=new int [99];
		do
		{
			System.out.println("Ingrese su nombre");
			nombre[i]=input.next();
			
			do {
				System.out.println("ingrese su categoria");
				categoria[i]=input.next();
			}while(!categoria[i].contentEquals("a")&&!categoria[i].contentEquals("b")&&!categoria[i].contentEquals("c"));
			switch(categoria[i])
			{
			case "a":
				basico[i]=20000;
				break;
			case "b":
				basico[i]=30000;
				break;
			case "c":
				basico[i]=40000;
				break;
			}
			do {
				System.out.println("ingrese su antiguedad");
				antiguedad[i]=input.nextInt();
			}
			while(!(antiguedad[i]>0&&antiguedad[i]<51));
			if(antiguedad[i]>=0&&antiguedad[i]<6) {
				diasVacaciones[i]=14;
			}
			else if(antiguedad[i]>=5&antiguedad[i]<11) {
				diasVacaciones[i]=16;
			}else if (antiguedad[i]>11&&antiguedad[i]<51)
			{
				diasVacaciones[i]=28;
			}
			i++;
			
			System.out.println("desea continuar?");
			menu=input.next();

		}while(!(menu.contentEquals("fin")));
		for(int j=0;j<i;j++) {
			
			System.out.println(diasVacaciones[j]);
		}
		

		
		
		input.close();
	}
}
