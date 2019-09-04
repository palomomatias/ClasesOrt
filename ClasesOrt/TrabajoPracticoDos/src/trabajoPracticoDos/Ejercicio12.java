package trabajoPracticoDos;
import java.util.Scanner;

public class Ejercicio12 {

	

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String menu= "n";
		int num1;
		int num2;
		int suma,resta,multiplicacion;
		float division,modulos;
		String opcion;
		System.out.println("Ingrese el primer numero");
		num1=input.nextInt();
		System.out.println("Ingrese el segundo numero");
		num2=input.nextInt();
		while(menu!="f")
		{
			
			
			do {
			System.out.println("\n\nQue OPERACION DESEA REALIZAR\n SUMAR (APRETE +)\n RESTAR (APRETE -)\n MULPLICAR (APRETE *)\n DIVIDIR (APRETE /)\n MODULO (%)\n SALIR (APRETE \"f\")");
			opcion=input.next();
			}while (!opcion.contentEquals("+")&&!opcion.contentEquals("-")&&!opcion.contentEquals("*")&&!opcion.contentEquals("/")&&!opcion.contentEquals("%")&&!opcion.contentEquals("f"));

			switch(opcion) {
			case "+":
				suma=sumar(num1,num2);
				break;
			case "-":
				resta=restar(num1,num2);
				break;
			case "*":
				multiplicacion=multiplicar(num1,num2);
				break;
			case "/":
				while (num2==0)
				{
					System.out.println("no se puede dividir por cero reingrese otro numero");
					num2=input.nextInt();
				}
				division=dividir(num1,num2);
				break;
			case "%":
				modulos=modulo(num1,num2);
				break;
			case "f":
				menu="f";
					break;			
		}
			
		}
		
		System.out.println("SALIENDO DEL PROGRAMA");
	

		
		input.close();
		
	}
	

	public static int sumar(int a,int b)
	{
		int resultado;
		resultado=a+b;
		System.out.println("El resultado de la suma es: "+resultado);
		return resultado;
	}
	
	public static int restar(int a,int b)
	{
	
		int resultado;
		resultado=a-b;
		System.out.println("El resultado de la resta es: "+resultado);
		return resultado;

	}

	public static int multiplicar(int a,int b)
	{
	
		int resultado;
		resultado=a*b;
		System.out.println("El resultado de la multiplicacion es: "+resultado);
		return resultado;

	}
	
	public static float dividir(int a,int b)
	{
		
		float resultado;
		resultado=(float)a/b;
		System.out.println("El resultado de la division es: "+resultado);
		return resultado;

	}
	
	public static float modulo(int a,int b)
	{
		
		float resultado;
		
		resultado=(float)a%b;
		System.out.println("El modulo es: "+resultado);
		return resultado;

	}
	
	
}
