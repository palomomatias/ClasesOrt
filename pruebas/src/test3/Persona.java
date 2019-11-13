package test3;

public class Persona {
	private int edad;
	private int numeroDePersonas;
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumeroDePersonas() {
		return numeroDePersonas;
	}

	public void setNumeroDePersonas(int numeroDePersonas) {
		this.numeroDePersonas = numeroDePersonas;
	}

	public Persona(int edad, int numeroDePersonas) {
		super();
		this.edad = edad;
		this.numeroDePersonas = numeroDePersonas;
	}

	@Override
	public String toString() {
		return "Persona: "+ numeroDePersonas + ", Edad: " + edad;
	}


	
}
