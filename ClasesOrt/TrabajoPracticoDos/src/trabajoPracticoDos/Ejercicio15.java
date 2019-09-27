package trabajoPracticoDos;

import java.util.Scanner;

public class Ejercicio15 {

	static Scanner input=new Scanner(System.in);	
	static final double COSTO_A=2;
	static final double COSTO_B=2;
	static final double COSTO_B_DOS=1.5;
	static final double COSTO_C=1;

	public static void main(String[] args) {		
		int codCliente;
		int duracion;
		char abono;

		double importeLlamada;
		double acumA=0;
		double acumB=0;
		double acumC=0;
		int max=0;
		int contLlamadasMenor6=0;
		int contLlamadas=0;
		double total=0;
				
		
		System.out.println("Ingrese el codigo de cliente a ingresar");
		codCliente=input.nextInt();
		while(!(codCliente>10000 && codCliente <100000) && codCliente!=0) {
			System.out.println("Error debe  ser entre 10001 y 99999. O cero para salir");
			codCliente=input.nextInt();
		}
		
		
		while (codCliente!=0) {
			
			duracion=pedirDuracion();
			abono=pedirAbono();
			importeLlamada=generarImporte(duracion,abono,COSTO_A,COSTO_B,COSTO_B_DOS,COSTO_C);
			
			switch(abono) {
			case 'a':
				acumA=(acumA+importeLlamada);
				break;
			case 'b':
				acumB=(acumB+importeLlamada);
				break;
			case 'c':
				acumC=(acumC+importeLlamada);
				break;	
			}
			
			total=(total+importeLlamada);
						
			if(duracion>max) {
				max=duracion;
			}
			
			
			if(duracion<6) {
				contLlamadasMenor6++;
			}
			
			contLlamadas++;
			
			System.out.println("ingrese el codigo de cliente");
			codCliente=input.nextInt();
		}
		double promedio=0;
		promedio=total/contLlamadas;
		
		System.out.println("El importe a recuadar por el abono a es: "+acumA);
		System.out.println("El importe a recaudar por el abono b es: "+acumB);
		System.out.println("El importe a recaudar por el abono c es: "+acumC);
		System.out.println("La llamda mas larga duro: "+max);
		System.out.println("Las llamadas menores a 6 minutos fueron: "+contLlamadasMenor6);
		System.out.println("El precio promedio de las llamadas es de: "+promedio);
		
	}
		
	
	
	
	static int pedirDuracion() {
		int dur;
		System.out.println("Ingrese la duracion de la llamada");
		dur=input.nextInt();
		while(dur<1) {
			System.out.println("La duracion debe ser mayor a cero (0)");
			dur=input.nextInt();
		}
		return dur;
	}
	
	static char pedirAbono() {
		char abono;
		System.out.println("Ingrese el tipo de abono");
		abono=input.next().charAt(0);
		while (abono!='a' && abono!='b' &&abono!='c') {
			System.out.println("Error. El abono debe ser 'a', 'b', 'c'");
			abono=input.next().charAt(0);
		}
		return abono;
	}
	
	static double generarImporte(int duracion, char abono, double COSTO_A,double COSTO_BMIN,double COSTO_BMAX,double COSTO_C) {
		double total=0;
		switch(abono) {
		case 'a':
			total=(duracion*COSTO_A);
			break;
		case 'b':
			if(duracion<=5) {
				total=(duracion*COSTO_BMIN);
			}else {
				total=((5*COSTO_BMIN)+((duracion-5)*COSTO_BMAX));
			}
			break;
		case 'c':
			if(duracion<=10) {
				total=(duracion*COSTO_C);
			}else {
				total=10;
			}
			break;	
		}
		return total;
	}
}