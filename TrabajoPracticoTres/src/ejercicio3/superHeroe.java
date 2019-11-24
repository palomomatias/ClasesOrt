package ejercicio3;

public class superHeroe {
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;
	
	public superHeroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		this.nombre=nombre;
		this.fuerza=fuerza;
		this.resistencia=resistencia;
		this.superpoderes=superpoderes;
	}
	
	public int jugar(superHeroe oponente) {
		int contRival=0;
		int contNuestro=0;
		int resultado=0;
		
		if (oponente.getFuerza()>this.getFuerza()) {
			contRival++;
		}else if (oponente.getFuerza()==this.getFuerza()) {
			contRival++;
			contNuestro++;
		} else {
			contNuestro++;
		}
		
		if (oponente.getResistencia()>this.getResistencia()) {
			contRival++;
		}else if (oponente.getResistencia()==this.getResistencia()) {
			contRival++;
			contNuestro++;
		} else {
			contNuestro++;
		}
		
		if (oponente.getSuperpoderes()>this.getSuperpoderes()) {
			contRival++;
		} else if (oponente.getSuperpoderes()==this.getSuperpoderes()) {
			contRival++;
			contNuestro++;
		}else {
			contNuestro++;
		}
		
		if (contNuestro<contRival) {
			resultado=2;
		} else if(contNuestro>contRival) {
			resultado=1;
		}else {
			resultado=3;
		}
		return resultado;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	public int getSuperpoderes() {
		return superpoderes;
	}

	public void setSuperpoderes(int superpoderes) {
		this.superpoderes = superpoderes;
	}

	@Override
	public String toString() {
		return "superheroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superpoderes=" + superpoderes + "]";
	}
	
}
