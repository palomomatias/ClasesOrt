package ejercicio4;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int reci=0;
		int cafeAgregar=0;
		
		cafetera cafetera1= new cafetera();
		System.out.println(cafetera1.toString());
		cafetera1.llenarCafetera();
		
		System.out.println(cafetera1.toString());
		System.out.println("cuanto quiere servir?");
		reci = input.nextInt();
		cafetera1.servirTaza(reci);
		System.out.println(cafetera1.toString());
		System.out.println("cuantos quiere servir?");
		
		reci = input.nextInt();
		
		cafetera1.servirTaza(reci);
		
		System.out.println(cafetera1.toString());

		cafetera1.vaciarCafetera();
		
		System.out.println(cafetera1.toString());
		
		System.out.println("cuanto cafe va a agregar ");
		
		cafeAgregar=input.nextInt();
		
		while (cafetera1.getCapacidadMaxima()<(cafetera1.getCantidadActual()+cafeAgregar)) {
			System.out.println("no se puede agregar el cafe \n cuanto cafe quiere agregar?");
			
			cafeAgregar = input.nextInt();
		}
			
		
		cafetera1.agregarCafe(cafeAgregar);
		
		System.out.println(cafetera1.toString());
		
		input.close();
	}

}
