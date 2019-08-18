package trabajoPractico;
import java.util.Scanner;
public class EjercicioOcho {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int num1;
		
		System.out.println("ingrese un numero del 1 a 7");
		num1=input.nextInt();
		switch(num1)
		{
		case 1:
			System.out.println("Hoy es domingo");
			break;
		case 2:
			System.out.println("Hoy es lunes");
			break;
		case 3:
			System.out.println("Hoy es martes");
			break;
		case 4:
			System.out.println("Hoy es miercoles");
			break;
		case 5:
			System.out.println("Hoy es jueves");
			break;
		case 6:
			System.out.println("Hoy es viernes");
			break;
		case 7:
			System.out.println("Hoy es sabado");
			break;
			default:
				System.out.println("el dia ingresado no es valido");
				break;
		}
		
		
		
		input.close();
	}

}