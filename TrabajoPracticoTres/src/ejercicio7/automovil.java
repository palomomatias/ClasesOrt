package ejercicio7;

public class automovil {
	private String marca;
	private String modelo;
	private String patente;
	private double capacidadTotalCombustible;
	private double cantidadCombustible;
	private double kmPorLitro;
	
	public automovil(String marca,String modelo,String patente) {
		this.marca=marca;
		this.modelo=modelo;
		this.patente=patente;
	}
	

	public double getCapacidadTotalCombustible() {
		return capacidadTotalCombustible;
	}

	public void setCapacidadTotalCombustible(double capacidadTotalCombustible) {
		this.capacidadTotalCombustible = capacidadTotalCombustible;
	}

	public double getCantidadCombustible() {
		return cantidadCombustible;
	}

	public void setCantidadCombustible(double cantidadCombustible) {
		this.cantidadCombustible = cantidadCombustible;
	}

	public double getKmPorLitro() {
		return kmPorLitro;
	}

	public void setKmPorLitro(double kmPorLitro) {
		this.kmPorLitro = kmPorLitro;
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", patente=" + patente
				+ ", capacidadTotalCombustible=" + capacidadTotalCombustible + ", cantidadCombustible="
				+ cantidadCombustible + ", kmPorLitro=" + kmPorLitro + "]";
	}
	
	
public boolean viajar(double kilometros) {
		
		if (this.getCantidadCombustible()-(this.getKmPorLitro()*kilometros)<0) {
			return false;
		} else {
			this.setCantidadCombustible(this.getCantidadCombustible()-this.getKmPorLitro()*kilometros);
			return true;
		}
	}
	
	private boolean verificarCantidadCombustible(double nafta) {
		
		if (this.getCapacidadTotalCombustible()<(this.getCantidadCombustible()+nafta)) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean cargarCombustible(double nafta) {
		boolean verificacion=false;
		
		verificacion=this.verificarCantidadCombustible(nafta);
		
		if (verificacion==true) {
			this.setCantidadCombustible(nafta+this.getCantidadCombustible());
			return true;
		} else {
			return false;
		}
		
	}
	
}
