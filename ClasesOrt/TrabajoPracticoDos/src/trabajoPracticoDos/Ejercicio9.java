package trabajoPracticoDos;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String contraseñaYusuario[]={"matias","asd123"};
		String usuario;
		String contraseña;
		int contador=0;
		do
		{
			System.out.println("Ingrese su usuario");
			usuario=input.next();
			System.out.println("Ingrese su contraseña");
			contraseña=input.next();
			contador++;
			
		}while(!(usuario.equals(contraseñaYusuario[0])&&contraseña.equals(contraseñaYusuario[1]))&&contador<3);
		if(contador==3)
		{
			System.out.println("SE HA BLOQUEADO LA CUENTA");
		}
		else
		{
			System.out.println("SE INGRESO CORRECTAMENTE");
		}
		
		
			
		input.close();
	}

}
