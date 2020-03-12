package Clase1;

import java.util.Scanner;

public class usuario {
	private String nombre;
	private String pass;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public usuario(String nombre, String pass) {
		this.nombre = nombre;
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "usuario [nombre=" + nombre + ", pass=" + pass + "]";
	}
	
	public boolean verificarPasss(String nombre,String pass)
	{	
		
		boolean respuesta=false;
		
		
		if(this.getNombre().contentEquals(nombre)&&this.getPass().contentEquals(pass))
		{
			
			respuesta=true;
			
		}
				return respuesta;
	}
	public String verificarPass(String passs)
	{
		String respuesta="";
		Scanner input=new Scanner(System.in);
		while(passs.length()>8)
		{
			System.out.println("ingreso mas de 8 caracteres");
			System.out.println("reingrese passs");
			passs=input.next();
		}
		
		return passs;
	}
	
}
