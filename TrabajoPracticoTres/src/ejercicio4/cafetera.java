package ejercicio4;

public class cafetera {
	private int capacidadMaxima;
	private int cantidadActual;
	
	public cafetera() {
		this.capacidadMaxima=1000;
		this.cantidadActual=0;
	}
	
	public void llenarCafetera() {
		this.setCantidadActual(getCapacidadMaxima());
	}
	
	public void servirTaza(int capTaza) {
		
			if (capTaza>this.getCantidadActual()) {
				System.out.println("se sirvieron solamente " + (this.getCantidadActual() + "de los " + capTaza + " que tiene la taza"));
				this.setCantidadActual(this.getCantidadActual()-capTaza);
				
				if(this.getCantidadActual()-capTaza<0) {
					this.setCantidadActual(0);
				}
			}else {
				this.setCantidadActual(this.getCantidadActual()-capTaza);
			}
	}
	
	public void vaciarCafetera() {
		this.setCantidadActual(0);
	}
	
	public void agregarCafe(int cafeAgregado) {
		this.setCantidadActual(this.getCantidadActual()+cafeAgregado);
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	@Override
	public String toString() {
		return "Cafetera [capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + "]";
	}
	
}
