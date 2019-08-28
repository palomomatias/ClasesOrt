package trabajoPractico;
import java.util.Scanner;

public class EjercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		String nombre;
		System.out.println("ingrese su nombre");
		nombre=input.nextLine();
		System.out.println("su nombre es "+nombre);
		input.close();
	}

}
