package parcialDos;
import java.util.Scanner;
public class Test {
	
	static Academia ORT=new Academia("ORT",0);
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int pedirDni;
		double deuda;
		String nombre;
		String conocimiento;
		System.out.println("ingrese el numero de dni para registrar el alumno(0 para salir)\n");
		pedirDni=input.nextInt();
		while(pedirDni!=0)
		{
			System.out.println("ingrese el nombre del alumno\n");
			nombre=input.next();
			
			conocimiento=ORT.pedirConocimiento();
			System.out.println("ingrese la deuda del alumno\n");
			deuda=input.nextDouble();
			
			ORT.inscribirAlumno(pedirDni, nombre, conocimiento, deuda);
			System.out.println("ingrese el numero de dni para registrar el alumno(0 para salir)\n");
			pedirDni=input.nextInt();
			
		}
		
		menu();
		
		input.close();
		
	}
	
	public static void menu()
	{
		int opcion;
		int dni;
		double pago;
		do {
		System.out.println("que desea realizar\n 1- BAJA DE ALUMNO \n 2- LISTAR ALUMNOS POR NIVEL \n 3- CARGAR PAGO \n 4- LISTAR ALU \n 5- SALIR");
		opcion=input.nextInt();
		
		switch(opcion)
		{
		
		case 1:
			
			ORT.listarAlu();
			System.out.println("ingrese el dni del alumno que quiere dar de baja\n ");
			dni=input.nextInt();
			ORT.ingresarBajaAlumno(dni);
			break;
		case 2:
			
			System.out.println("ingrese el nivel del alumno que quiera listar");
			ORT.listarAlumnosNivel();
			break;
		case 3:
			
			ORT.listarAluDeudas();
			System.out.println("ingrese el dni que desea pagar ");
			dni=input.nextInt();
			System.out.println("ingrese el monto a pagar");
			pago=input.nextDouble();
			ORT.cargarPago(dni, pago);
			break;
		case 4:
			ORT.listarAlu();
		case 5:
			
			opcion=0;
			break;
		default:
			System.out.println("error reingrese un numero correcto");
			break;
		}
		
		}
		while(opcion!=0);
		
		
		
	}
	
	
	
	
	
	
	
	

}
