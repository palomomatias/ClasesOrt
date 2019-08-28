package trabajoPractico;
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String nombre;
		String fecha;
		String producto;
		int cantidad;
		int precio;
		int total;
		
		
		System.out.println("ingrese una fecha de formato YYYYMMDD");
		fecha=input.next();
		System.out.println("ingrese su nombre");
		nombre=input.next();
		System.out.println("ingrese el producto que desea comprar");
		producto=input.next();
		System.out.println("ingrese la cantidad que");
		cantidad=input.nextInt();
		System.out.println("ingrese el precio unitario");
		precio=input.nextInt();
		total=precio*cantidad;
	
		System.out.println("FECHA DE COMPRA: "+fecha);
		System.out.println("NOMBRE: "+nombre);
		System.out.println("PRODUCTO:"+producto);
		System.out.println("CANTIDAD:"+cantidad);
		System.out.println("PRECIO UNITARIO: $"+precio);
		System.out.println("TOTAL A PAGAR: $"+total);
		
		input.close();
	}

}