package ejercicio7;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		double viaje=0;
		boolean viajeRealizado=false;
		double combustible=0;
		boolean cargaRealizada=false;
		
		automovil auto1=new automovil("Ford","Fiesta", "ABCD123");
		
		auto1.setCantidadCombustible(20);
		auto1.setCapacidadTotalCombustible(40);
		auto1.setKmPorLitro(10);
		
		System.out.println(auto1.toString());
		
		do {
			System.out.println("cuantos km va a viajar?");
			viaje=input.nextDouble();
			
			viajeRealizado=auto1.viajar(viaje);
		} while (!viajeRealizado);
		
		System.out.println(auto1.toString());
		
		do {
			System.out.println("cuanto combustible quiere cargar?");
			combustible=input.nextDouble();
			
			cargaRealizada=auto1.cargarCombustible(combustible);
		} while (!cargaRealizada);
		
		System.out.println(auto1.toString());

		input.close();
	}
	}

