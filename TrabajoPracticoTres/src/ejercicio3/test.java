package ejercicio3;

public class test {

	public static void main(String[] args) {
	int resultadoJuego=0;
		
		superHeroe heroe1=new superHeroe("batman",95,60,5);
		
		superHeroe heroe2=new superHeroe("superman",90,65,0);
		
		resultadoJuego = heroe1.jugar(heroe2);
		
		switch (resultadoJuego) {
		case 1:
			System.out.println("ganó " + heroe1.getNombre());
			break;
		case 2:
			System.out.println("perdió " + heroe1.getNombre());
			break;
		case 3:
			System.out.println("es un empate");
			break;
	}

	}
	}
