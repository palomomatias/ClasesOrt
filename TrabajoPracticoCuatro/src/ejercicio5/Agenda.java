package ejercicio5;

import java.util.ArrayList;

public class Agenda {

	private ArrayList <Persona>li_persona=new ArrayList<Persona>();
	
	
	public void agregar(Persona persona)
	{
		li_persona.add(persona);
	}
	@Override
	public String toString() {
		return "Agenda [li_persona=" + li_persona + "]";
	}
	public ArrayList<Persona> getLi_persona() {
		return li_persona;
	}
	public void setLi_persona(ArrayList<Persona> li_persona) {
		this.li_persona = li_persona;
	}
	public void eliminar(ArrayList<Persona> personas,int dni)
	{
		for(int i=0;i<personas.size();i++)
		{
			if(personas.get(i).getDni()==dni)
			{
				personas.remove(i);
			}	
		}
	}
	public void mostrarPorDni(ArrayList<Persona> personas,int dni)
	{
		for(int i=0;i<personas.size();i++)
		{
			if(personas.get(i).getDni()==dni)
			{
				System.out.println(li_persona.get(i).toString());
			}	
		}
	}
	
}
