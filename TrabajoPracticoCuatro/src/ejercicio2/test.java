package ejercicio2;

public class test {

	public static void main(String[] args) {
		CD cd1 =new CD();
		
		for(int i=1;i<10;i++)
		{
			Cancion cancion=new Cancion("cancion " + i);
			
			cd1.agregar(cancion);
			
			
		}
	cd1.numeroCanciones();
	cd1.dameCancion(4);
	System.out.println(cd1.getCanciones());
	Cancion cancion2=new Cancion ("asdasdsadsad");
	
	cd1.grabarCanciones(4, cancion2);
	System.out.println(cd1.getCanciones());
	cd1.eliminar(4);
	System.out.println(cd1.getCanciones());
	}
}
