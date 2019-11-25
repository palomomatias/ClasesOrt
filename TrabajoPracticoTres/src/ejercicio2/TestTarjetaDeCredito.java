package ejercicio2;

import java.util.Scanner;

public class TestTarjetaDeCredito {
	
	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		String numero;
		String titular;
		double limite;
		double limiteActualizado;
		System.out.println("INGRESE SU NOMBRE");
		titular=input.next();
		System.out.println("INGRESE SU NUMERO DE TARJETA");
		numero=input.next();
		System.out.println("INGRESE SU LIMITE");
		limite=input.nextInt();
		
		TarjetaDeCredito tarjeta=new TarjetaDeCredito(numero,titular,limite);
		System.out.println("INGRESE EL PRECIO DE SU COMPRA");
		
		tarjeta.realizarCompra(input.nextDouble());
		System.out.println(tarjeta.toString());
		System.out.println("INGRESE SU NUEVO LIMITE");
		limiteActualizado=input.nextDouble();
		
		tarjeta.actualizarLimite(limiteActualizado);
		System.out.println(tarjeta.toString());
	}

}
