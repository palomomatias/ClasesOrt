package trabajoPractico;
import java.util.Scanner;
public class EjercicioNueve {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		double num1;
		double num2;
		double num3;
		String nombre1;
		String nombre2;
		String nombre3;
		double resultado;
		double porcentaje;
		double porcentaje2;
		double porcentaje3;
		double totalAportado;
		
		System.out.println("ingrese su nombre");
		nombre1=input.next();
		System.out.println("ingrese el primero capital");
		num1=input.nextDouble();
		System.out.println("ingrese su nombre");
		nombre2=input.next();
		System.out.println("ingrese el segundo capital");
		num2=input.nextDouble();
		System.out.println("ingrese su nombre");
		nombre3=input.next();
		System.out.println("ingrese el tercer capital");
		num3=input.nextDouble();
		resultado=num1+num2+num3;
		porcentaje=(100*num1)/resultado;
		porcentaje2=(100*num2)/resultado;
		porcentaje3=(100*num3)/resultado;
		totalAportado=num1+num2+num3;
		System.out.println("Nombre "+nombre1+" Capital Aportado "+num1+" Porcentaje aportado "+porcentaje);
		System.out.println("Nombre "+nombre2+" Capital Aportado "+num2+" Porcentaje aportado "+porcentaje2);
		System.out.println("Nombre "+nombre3+" Capital Aportado "+num3+" Porcentaje aportado "+porcentaje3);
		System.out.println("Total capital aportado "+totalAportado);
		input.close();
	}

}