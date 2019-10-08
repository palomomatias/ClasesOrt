package trabajoPracticoTres;

public class Persona {


	private String nombre;
	private String apellido;
	private String direccion;
	 
	
	public String getNombre()
	{
		return nombre;
		
	}
	public void setNombre(String nombre)
	{
		 this.nombre=nombre;
	}
	
	
	public void setApellido(String ape)
	{
		this.apellido=ape;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getDireccion(){
		
		return direccion;
	}
	
	public void setDireccion(String direccion)
	{
		this.direccion=direccion;
	}
	
	
	public Persona() {
		
	}
	@Override
	
	public String toString() {
		return "persona [nombre:" + nombre + ", apellido:" + apellido + ", direccion:" + direccion + "]";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
