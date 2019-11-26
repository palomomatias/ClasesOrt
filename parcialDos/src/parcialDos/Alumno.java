package parcialDos;

public class Alumno {

	private int dni;
	private String nombre;
	private String conocimiento;
	private double deuda;
	private String estado;
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
	public String getConocimiento() {
		return conocimiento;
	}
	public void setConocimiento(String conocimiento) {
		this.conocimiento = conocimiento;
	}
	public double getDeuda() {
		return deuda;
	}
	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", conocimiento=" + conocimiento + ", deuda=" + deuda
				+ ", estado=" + estado + "]";
	}
	public Alumno(int dni, String nombre, String conocimiento, double deuda, String estado) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.conocimiento = conocimiento;
		this.deuda = deuda;
		this.estado = estado;
	}
	
	
}
