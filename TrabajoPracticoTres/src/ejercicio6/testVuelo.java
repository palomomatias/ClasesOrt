package ejercicio6;

import java.util.Scanner;

public class testVuelo {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		
		int asientosReservados=0;
		boolean reservaValida=false;
		int asientosLiberados=0;
		boolean liberacionValida=false;
		
		
		vuelo vuelo1 = new vuelo("Aeroparque","Miami","01/06/2018",1234, 250);
		
		vuelo1.setAsientosOcupados(15);
		
		System.out.println(vuelo1.toString());
		
		do {
			System.out.println("cuantos asientos va a reservar?");
			asientosReservados=input.nextInt();
			
			reservaValida=vuelo1.reservar(asientosReservados);
		} while (!reservaValida);
		
		System.out.println(vuelo1.toString());
		
		do {
			System.out.println("cuantos asientos se van a liberar?");
			asientosLiberados=input.nextInt();

			liberacionValida=vuelo1.liberarAsientos(asientosLiberados);
		} while (!liberacionValida);
		
		System.out.println(vuelo1.toString());

		input.close();

	}
}
