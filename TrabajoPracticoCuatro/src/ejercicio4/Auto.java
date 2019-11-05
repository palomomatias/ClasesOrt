package ejercicio4;

public class Auto {
	private String matricula;
	private String marca;
	private String modelo;
	private int km;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	@Override
	public String toString() {
		return "Auto [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", km=" + km + "]";
	}
	public Auto(String matricula, String marca, String modelo, int km) {
	
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
	}
	
	
}
