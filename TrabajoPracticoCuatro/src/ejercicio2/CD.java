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

	@Override
	public String toString() {
		return "CD [canciones=" + canciones + ", contador=" + contador + "]";
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
		
		System.out.println(canciones.get(numero-1).toString());
	}
	


	public void grabarCanciones(int indice, Cancion cancion)
	{
		
		canciones.add(indice, cancion);
	}
	public void eliminar(int indice)
	{
		canciones.remove(indice);
	}

}
