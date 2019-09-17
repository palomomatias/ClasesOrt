package TestParciales;

import java.util.Scanner;

public class testParcial2 {

	
	private static Scanner input= new Scanner(System.in);
	private static int contadorBJK=0, contadorPKR=0, contadorRUL=0;
	public static void main(String[] args) {
		String nombre;
		String nombreJuego;
		int plataInicial;
		int plataDelJuego;
		int plataResultadoDeljuego;
		double porcentaDelFinDelJuego;
		System.out.println("ingrese su nombre");
		nombre=input.next();
		plataInicial=pedirPlata();
		int plataTotal=plataInicial;
		do {
		nombreJuego=pedirJuego();
		plataDelJuego=valorDeCadaJuego(nombreJuego);
		if(leAlcanzaParaJugar(plataDelJuego,plataTotal))
				{
					plataTotal=plataTotal-plataDelJuego;
					plataResultadoDeljuego=calcularPlata(plataDelJuego);
					plataTotal=plataTotal+plataResultadoDeljuego;
					
				}
		else
			System.out.println("NO LE ALCANZA PARA ESTE JUEGO");
			System.out.println("USTED TIENE HASTA EL MOMENTO UN SALDO DE "+plataTotal);
			porcentaDelFinDelJuego=calcularPorcentajeFinDeJuego(plataInicial);

		}while(plataTotal<5000&&porcentaDelFinDelJuego<plataTotal&&100<plataTotal);
		
		System.out.println("la plata restante es "+plataTotal);
		System.out.println("cantidad de veces jugadas de ruleta "+contadorRUL+"poker "+contadorPKR+"black jack"+contadorBJK);
		
		input.close();
	}
	
static int calcularPlata(int plataDelJuego) {
		int resultado=0;
		int random=obtenerResultado();
		if(random==1)
		{
			resultado=plataDelJuego;
		}
		else if (random==2)
		{
			resultado=plataDelJuego*2;
		}
		else if (random==0)
			resultado=0;
		return resultado;
	
	}
static double calcularPorcentajeFinDeJuego(int plataInicial)
{
	double resultado=0;
	resultado=(double)(plataInicial*0.20);
	return resultado;

}
static boolean leAlcanzaParaJugar(int plataJuego, int plataInicial)
	{
		if(plataJuego<=plataInicial)
			return true;
		else
			return false;
	}
static int valorDeCadaJuego(String nombreDeljuego)
{
int valor=0;
	switch(nombreDeljuego)
	{
	case "RUL":
		System.out.println("USTED INGRESO A LA RULETA QUE TIENE UN COSTO DE $100");
		valor=100;
		contadorRUL++;
		break;
	case "BJK":
		System.out.println("USTED INGRESO AL BLACK JACK QUE TIENE UN COSTO DE $200");
		valor=200;
		contadorBJK++;
		break;
	case "PKR":
		System.out.println("USTED INGRESO AL POKER QUE TIENE UN COSTE DE $500");
		contadorPKR++;
		valor=500;
		break;
	}
		
	return valor;

}
static int pedirPlata()
{
	int retorno=0;
	System.out.println("ingrese plata inicial");
	retorno=input.nextInt();
	
	while(retorno<490)
		{
		System.out.println("Error, tiene que se mayor a 500");
		retorno=input.nextInt();
		
		}
	return retorno;
}
public static int obtenerResultado() {

	return (int) (Math.random() * 3);

}
static String pedirJuego()
{
	String mensaje;
	System.out.println("HAY 3 JUEGOS \n *RULETA(APRETE RUL) \n *BLACK JACK(BJK)\n *POKER(PKR)");
	mensaje=input.next();
while(mensaje.contains("RUL")&&mensaje.contains("BJK")&&mensaje.contains("PKR"))
{
	System.out.println("ERRO REINGRE UN JUEGO VALIDO \n*RULETA(APRETE RUL) \\n *BLACK JACK(BJK)\\n *POKER(PKR) ");
	mensaje=input.next();
}
	return mensaje;
}
}
