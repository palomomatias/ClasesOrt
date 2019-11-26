package parcialDos;

import java.util.ArrayList;
import java.util.Scanner;
public class Academia {
		private final Scanner input=new Scanner(System.in);
		private String nombre;
		private int cantidadAlu=0;
		private ArrayList<Alumno> alumnos;
		
		
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public int getCantidadAlu() {
			return cantidadAlu;
		}
		
		public void setCantidadAlu(int cantidadAlu) {
			this.cantidadAlu = cantidadAlu;
		}
		
		public ArrayList<Alumno> getAlumnos() {
			return alumnos;
		}
		
		public void setAlumnos(ArrayList<Alumno> alumnos) {
			this.alumnos = alumnos;
		}
		@Override
		public String toString() {
			return "Academia [nombre=" + nombre + ", cantidadAlu=" + cantidadAlu + ",\n alumnos=" + alumnos + "]\n";
		}
		
		public Academia(String nombre, int cantidadAlu) {
			super();
			this.nombre = nombre;
			this.cantidadAlu = cantidadAlu;
			this.alumnos = new ArrayList<>();
		}
		
		private Alumno buscarAlumno(int dni)
		{
			
			boolean bandera=false;
			Alumno retorno=null;
			int i =0;
			while(i<alumnos.size()&&!bandera)
			{
				if(alumnos.get(i).getDni()==dni)
				{
					
					retorno=alumnos.get(i);
					bandera=true;	
				}
				else
				{
					i++;
				}
				
			}
			
			return retorno;
		}
	 
		public void inscribirAlumno(int dni,String nombre,String conocimiento,double deuda)
		{
			Alumno alumnoEncontrado=null;
			alumnoEncontrado=buscarAlumno(dni);
			String estado="A";
			if(alumnoEncontrado==null)
			{
				
				alumnoEncontrado=new Alumno (dni,nombre,conocimiento,deuda,estado);
				alumnos.add(alumnoEncontrado);
				cantidadAlu++;
				System.out.println("alumno inscripto correctamente ");
				
			}
			else
			{
				System.out.println("Este alumno ya existe ");
			}
			
		}
		public void ingresarBajaAlumno(int dni)
		{
			Alumno encontro=null;
			encontro=buscarAlumno(dni);
			if(encontro!=null&&encontro.getDeuda()<=0)
			{
				encontro.setEstado("B");
				System.out.println("estado cambiado con exito");
			}
			else
			{
				System.out.println("el alumno tiene deuda o no existe");
			}
		}

		public String pedirConocimiento()
		{
			String opcion;
			System.out.println("\n-BASICO\n-INTERMEDIO\n-AVANZADO");
			opcion=input.next();
			while(!opcion.contentEquals("BASICO")&&!opcion.contentEquals("INTERMEDIO")&&!opcion.contentEquals("AVANZADO"))
			{
				System.out.println("error reingre\n-BASICO\n-INTERMEDIO\n-AVANZADO");
				opcion=input.next();
			}
			return opcion;
		}
		
		public void listarAlu()
		{
			for(int i=0;i<alumnos.size();i++)
			{
					System.out.println(alumnos.get(i).toString());					
			}
		}
		public void listarAluDeudas()
		{
			for(int i=0;i<alumnos.size();i++)
			{
				if(alumnos.get(i).getDeuda()>0)
				{
					System.out.println(alumnos.get(i).toString());					
				}
				}
		}
		
		public void listarAlumnosNivel()
		{
			int i;
			String opcion;
			opcion=pedirConocimiento();
			for(i=0;i<alumnos.size();i++)
			{
				if(alumnos.get(i).getEstado().contentEquals("A")&&alumnos.get(i).getConocimiento().contentEquals(opcion))
				{
					System.out.println(alumnos.get(i).toString());	
				}
			}
			
		}
		public void cargarPago(int dni,double pago)
		{
		
		double resultado=0;
		Alumno encontro=null;
		encontro=buscarAlumno(dni);
		if(encontro!=null)
			{
			resultado=encontro.getDeuda()-pago;
			encontro.setDeuda(resultado);
			System.out.println("El pago se realizo correctamente");
			}
		else
			{
			System.out.println("alumno no existe");
			
			}
			
			
		}
		
		
}







