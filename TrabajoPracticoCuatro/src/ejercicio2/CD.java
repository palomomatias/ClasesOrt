package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;
public class CD {
	 
	private ArrayList<Cancion> canciones =new ArrayList<Cancion>();
	private int contador=0;
	static Scanner input=new Scanner(System.in);
	
	


	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}


	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}


	public int getContador() {
		return contador;
	}


	public void setContador(int contador) {
		this.contador = contador;
	}
	
	
	
	public void agregar (Cancion cancion)
	{
		canciones.add(cancion);	
	}
	
	public void numeroCanciones()
	{
		System.out.println(canciones.size());
		
	}
	public void dameCancion(int numero)
	{
		int indice;
		System.out.println("ingrese el numero de la posicion indica");
		numero=input.nextInt();
		System.out.println(canciones.get(numero));
	}

}
