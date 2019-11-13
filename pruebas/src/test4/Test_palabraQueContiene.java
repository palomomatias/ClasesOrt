package test4;

import java.util.ArrayList;

public class Test_palabraQueContiene {

	public static void main(String[] args) {

		float pro = 0;
		double sum = 0;
		int aluentre = 0;

		//Crear 10 personas
		Alumnos p1 = new Alumnos(17203630, "Ana", 20," ana20@gmail.com");
		Alumnos p2 = new Alumnos(17203631, "Jose", 15," jose15@gmail.com»");
		Alumnos p3 = new Alumnos(17203632, "Frank", 22," «frank22@hotmail.com»");
		Alumnos p4 = new Alumnos(17203633, "Carlos", 20, "carlos20@hotmail.com»");
		Alumnos p5 = new Alumnos(17203634, "Maria", 18, "«maria18@hotmail.com»");
		Alumnos p6 = new Alumnos(17203635, "Samuel", 20, "«samuel20@hotmail.com»");
		Alumnos p7 = new Alumnos(17203636, "Sar", 21," «sara21@gmail.com»");
		Alumnos p8 = new Alumnos(17203637, "Nicol", 20," «nicol20@gmail.com»");
		Alumnos p9 = new Alumnos(17203638, "Marcos", 22," «marcos22@gmail.com»");
		Alumnos p10 = new Alumnos(17203639, "Anabel", 10," «anabel10@hotmail.com»");

	
		//Crear una lista de personas
		ArrayList<Alumnos>lista=new ArrayList<Alumnos>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);
		lista.add(p6);
		lista.add(p7);
		lista.add(p8);
		lista.add(p9);
		lista.add(p10);
		System.out.println(lista.toString());
		for (Alumnos alumno: lista) {
			String nombreAlumno = alumno.getNombre();
			int cantCaracteresNombre = nombreAlumno.length();
			if (cantCaracteresNombre == 3) {
			System.out.println("Tiene 3 caracteres el nombre: " + nombreAlumno );
			}

			String email = alumno.getMail();
			if (email.contains("@hotmail.com")) {
			System.out.println("El siguiente email es Hotmail: " + email);
			}
			}
		
		
		
		
	}
}
