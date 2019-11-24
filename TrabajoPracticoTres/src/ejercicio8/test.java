package ejercicio8;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
		
		boolean alcanzar=false;
		int distancia=0;
		
		Gato gato1=new Gato(100);
		
		Raton raton1=new Raton(100);
		
		System.out.println(gato1.toString());
		System.out.println(raton1.toString());

		
		System.out.println("a cuantos metros esta el raton?");
		distancia=input.nextInt();
		

		alcanzar=gato1.alcanzar(raton1,distancia);
		
		if (alcanzar==true) {
			System.out.println("lo alcanzo");
		} else {
			System.out.println("no lo alcanzo");
		}
		
		input.close();
	}

}
