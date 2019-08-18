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
		System.out.println("su nombre es:    su capital es:    porcentaje aportado\n"+nombre1+"        "+num1+ "        "+porcentaje+" \n"  +nombre2+"        "+num2+"        "+porcentaje2+"\n"+nombre3+"        "+num3+"        "+porcentaje3);
		System.out.println("");
		input.close();
	}

}