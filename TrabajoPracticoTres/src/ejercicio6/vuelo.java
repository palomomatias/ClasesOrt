package ejercicio6;

public class vuelo {

	private String origen;
	private String destino;
	private String fecha;
	private int numero;
	private int capacidadTotal;
	private int asientosOcupados;
	
	public vuelo(String origen,String destino,String fecha,int numero,int capacidadTotal) {
		this.origen=origen;
		this.destino=destino;
		this.fecha=fecha;
		this.numero=numero;
		this.capacidadTotal=capacidadTotal;
	}
	
	

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCapacidadTotal() {
		return capacidadTotal;
	}

	public void setCapacidadTotal(int capacidadTotal) {
		this.capacidadTotal = capacidadTotal;
	}
	
	public int getAsientosOcupados() {
		return asientosOcupados;
	}

	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}

	@Override
	public String toString() {
		return "Vuelo [origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + ", numero=" + numero
				+ ", capacidadTotal=" + capacidadTotal + ", asientosOcupados=" + asientosOcupados + "]";
	}
	
	public boolean reservar(int reservas) {
		boolean reservado=false;
		
		if (this.getCapacidadTotal()<this.getAsientosOcupados()+reservas) {
			return reservado;
		} else {
			this.setAsientosOcupados(reservas+this.getAsientosOcupados());
			reservado=true;
			return reservado;
		}
	}
	
	public boolean liberarAsientos(int asientosLiberar) {
		boolean liberados=false;
		
		if (asientosLiberar>this.getCapacidadTotal()) {
			return liberados;
		} else {
			this.setAsientosOcupados(this.getAsientosOcupados()-asientosLiberar);
			liberados=true;
			return liberados;
		}
	}

}
