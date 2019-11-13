package ejercicio2;

public class Cancion {
	private String cancion;

	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}

	public Cancion(String cancion) {
		
		this.cancion = cancion;
	}

	@Override
	public String toString() {
		return  cancion ;
	}
	
	
}
