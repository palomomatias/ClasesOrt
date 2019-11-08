package ejercicio5;

public class Persona {
	private String nombre;
	private String Apellido;
	private int dni;
	private int telefono;
	private String mail;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", Apellido=" + Apellido + ", dni=" + dni + ", telefono=" + telefono
				+ ", mail=" + mail + "\n";
	}
	public Persona(String nombre, String apellido, int dni, int telefono, String mail) {
		super();
		this.nombre = nombre;
		Apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.mail = mail;
	}
	




}
