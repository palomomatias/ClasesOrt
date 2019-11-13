package test4;

public class Alumnos {
	private int dni;
	private String nombre;
	private int edad;
	private String mail;
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Alumnos [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", mail=" + mail + "]";
	}
	public Alumnos(int dni, String nombre, int edad, String mail) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.mail = mail;
	}
	
	
	
}
