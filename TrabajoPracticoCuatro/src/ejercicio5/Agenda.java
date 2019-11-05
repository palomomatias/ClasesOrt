package ejercicio5;

import java.util.ArrayList;

public class Agenda {

	private ArrayList <Persona>li_persona=new ArrayList<Persona>();
	
	private void agregar(Persona persona)
	{
		li_persona.add(persona);
	}
	private void eliminar(ArrayList<Persona> personas,int dni)
	{
		for(int i=0;i<personas.size();i++)
		{
			if(personas.get(i).getDni()==dni)
			{
				personas.remove(i);
			}	
		}
	}
	private void mostrarPorDni(ArrayList<Persona> personas,int dni)
	{
		for(int i=0;i<personas.size();i++)
		{
			if(personas.get(i).getDni()==dni)
			{
				personas.get(i).toString();
			}	
		}
	}
	
}
