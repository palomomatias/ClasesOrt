package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList<Producto> li_compras=new ArrayList<Producto>();
		String nombre;
		System.out.println("ingrese productos, F para finalizar");
		nombre=input.next();
		int cantidad;
		float precio;
		float resultado;
		while(!nombre.contentEquals("F"))
		{
			System.out.println("ingrese la canitdad");
			cantidad=input.nextInt();
			System.out.println("ingre el precio");
			precio=input.nextFloat();
			li_compras.add(new Producto (nombre,cantidad,precio));
			System.out.println("ingrese productos, F para finalizar");
			nombre=input.next();
		}
		resultado=calcular(li_compras);
		System.out.println(li_compras.toString());
		System.out.println(resultado);
	}
	public static float calcular(ArrayList<Producto> test)
	{
		float resultado=0;
		for(int i=0;i<test.size();i++)
		{
			resultado=(test.get(i).getPrecio()*test.get(i).getCantidad())+resultado;
			
		}
		return resultado;
		
	}
}
