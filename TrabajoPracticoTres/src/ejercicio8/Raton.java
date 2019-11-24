package ejercicio8;

public class Raton {
	private int energia;
	
	public Raton(int energia) {
		this.energia=energia/2;
	}
	

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	@Override
	public String toString() {
		return "Raton [energia=" + energia + "]";
	}
}
