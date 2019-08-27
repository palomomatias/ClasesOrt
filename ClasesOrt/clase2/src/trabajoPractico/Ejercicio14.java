package trabajoPractico;
import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		
		String opcion;
		Scanner input=new Scanner(System.in);
		int num1;
		int num2;
		double resultado;
		System.out.println("INGRESE UN NUMERO ");
		num1=input.nextInt();
		System.out.println("INGRESE OTRO NUMERO ");
		num2=input.nextInt();
		System.out.println("QUE DESEA REALIZAR:\n SUMA (APRETE S)\n RESTA (APRETE R)\n MULTIPLICACION (APRETE M)\n DIVISION (APRETE D)");
		opcion=input.next();
		switch(opcion)
		{
		case "S":
			resultado=num1+num2;
			System.out.println("LA SUMA DE LOS DOS NUMEROS ES :"+resultado);
			break;
		case "R":
			resultado=num1-num2;
			System.out.println("LA RESTA DE LOS DOS NUMEROS ES"+resultado);
			break;
		case "M":
			resultado=num1+num2;
			System.out.println("LA MULTIPLICACION DE LOS DOS NUMEROS ES"+resultado);
			break;
		case "D":
			while(num2==0)
			{
				
				System.out.println("NO SE PUEDE DIVIDIR POR CERO,INGRESE UN NUMERO MAYOR A 0");
				num2=input.nextInt();
			}
			resultado=(double)num1/num2;
			System.out.println("EL RESULTADO DE LA DIVISON ES"+resultado);
			break;
			default:
				System.out.println("INGRESE UNA OPCION VALIDO (LETRAS EN MAYUSCULA)");
				break;
		}
		
		input.close();
	}

}