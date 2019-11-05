package ejercicio3;

import java.util.Scanner;

public class Producto {
	private String nombre;
	private int cantidad=0;
	private float precio=0;
	static Scanner input=new Scanner(System.in);
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Producto(String nombre, int cantidad, float precio) {
		
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	public float total(int cantidad,float precio)
	{
		float resultado;
		resultado=cantidad*precio;
		return resultado;
		
	}

}
