package trabajoPracticoDos;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n1=15;
		int n2=3;
		boolean resultado=esMultiplo(n1,n2);
		if(resultado==true)
		{
			System.out.println("es multiplo");
		}
		else{
			System.out.println("no es multiplo");
		}
		
			
		input.close();
	}
	public static boolean esMultiplo(int n1,int n2){
		if (n1%n2==0)
			return true;
		else
			return false;
	}
}
