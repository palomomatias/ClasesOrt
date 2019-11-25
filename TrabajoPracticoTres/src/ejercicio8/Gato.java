package ejercicio8;

public class Gato {

	private int energia;
	
	public Gato(int energia) {
		this.energia=energia;
	}
	
	

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	@Override
	public String toString() {
		return "Gato [energia=" + energia + "]";
	}
	public boolean alcanzar(Raton raton1,int distancia) {
		
		if ((raton1.getEnergia()-this.getEnergia())+distancia>0) {
			return false;
		} else {
			return true;
		}
	}
}
