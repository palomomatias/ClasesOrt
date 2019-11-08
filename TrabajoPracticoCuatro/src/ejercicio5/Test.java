package ejercicio5;

public class Test {

	public static void main(String[] args) {
			
		Agenda agenda1= new Agenda();
		for(int i=1;i<10;i++)
		{
			
			Persona persona1 =new Persona("Nombre"+i,"Apellido"+i,i,i,"mail"+i);
			agenda1.agregar(persona1);
			
		}
		System.out.println(agenda1.getLi_persona());
		agenda1.eliminar(agenda1.getLi_persona(), 3);
		System.out.println(agenda1.getLi_persona());
		agenda1.mostrarPorDni(agenda1.getLi_persona(), 2);
		

	}

}
