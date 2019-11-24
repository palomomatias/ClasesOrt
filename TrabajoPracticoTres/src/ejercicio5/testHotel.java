package ejercicio5;

import java.util.Scanner;

public class testHotel {

	public static void main(String[] args) { 
Scanner input = new Scanner(System.in);
		
		int habitacionesSolicitadas=0;
		int habitacionesDesocupar=0;
		boolean solicitadasValido=false;
		boolean desocupadasValido=false;
		
		Hotel hotel1 = new Hotel("hilton", "caba",200,15);
		
		System.out.println(hotel1.toString());
		
		do {
			System.out.println("cuantas habitaciones se van a ocupar?");
			habitacionesSolicitadas=input.nextInt();
			
			solicitadasValido=hotel1.ocuparHabitaciones(habitacionesSolicitadas);
		} while (!solicitadasValido);
		
		System.out.println(hotel1.toString());
		
		do {
			System.out.println("cuantas habitaciones se van a desocupar?");
			habitacionesDesocupar=input.nextInt();
			
			desocupadasValido=hotel1.desocuparHabitaciones(habitacionesDesocupar);
		} while (!desocupadasValido);
		
		System.out.println(hotel1.toString());

		input.close();

	}

}
