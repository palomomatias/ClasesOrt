package Clase1;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		usuario User=new usuario("asd","asd");
		Scanner input=new Scanner(System.in);
		String nombre;
		String pass;
		int contador=0;
		boolean verificacion=true;
		
	do
		{
		if(contador>0)
		{
			System.out.println("datos incorrectos");
		}
		System.out.println("ingrese su usario");
		nombre=input.next();
		System.out.println("ingrese su pass");
		pass=input.next();
		User.verificarPass(pass);
		
		contador++;
		}
	while(!User.verificarPasss(nombre,pass)&&contador<3);
		if(verificacion)
		{
			System.out.println("ingreso Correctamente");
		}
		else
		{
					System.out.println("Usuario bloqueado");
		}			

	}

}
