package ejercicio1;

public class Test {

	public static void main(String[] args) {
		 
		Persona persona1=new Persona();
		Persona persona2=new Persona();
		
		
		persona1.setNombre("Diego");
		persona1.setApellido("Diaz");
		persona1.setDireccion("Rivadavia 432");
		persona2.setNombre("Pablo");
		persona2.setApellido("Perez");
		persona2.setDireccion("Yatay 222");
		
		System.out.println("Persona1"+persona1.toString());
		System.out.println("Persona2"+persona2.toString());
		
		
		
		
	}

}
