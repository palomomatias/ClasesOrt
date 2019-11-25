package ejercicio2;

public class TarjetaDeCredito {
	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double disponible;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getLimiteDeCompra() {
		return limiteDeCompra;
	}
	public void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}
	public double getDisponible() {
		return disponible;
	}
	public void setDisponible(double disponible) {
		this.disponible = disponible;
	}
	@Override
	public String toString() {
		return "TarjetaDeCredito [numero:" + numero + ", titular:" + titular + ", limiteDeCompra:" + limiteDeCompra
				+ ", disponible:" + disponible + "]";
	}
	public TarjetaDeCredito(String numero, String titular, double limiteDeCompra ) {
	
		this.numero = numero;
		this.titular = titular;
		this.limiteDeCompra = limiteDeCompra;
		this.disponible = limiteDeCompra;
	}
	
	private boolean puedoComprar(double monto)
	{
		if (monto<=this.getDisponible())
		return true;
		else
			return false;
		
	}
	public boolean realizarCompra(double monto)
	{
		double result;
		if(puedoComprar(monto))
		{
			result=this.getDisponible()-monto;
			this.setDisponible(result);
			return true;
		}
		else
		{
			System.out.println("no se puede realizar la compra");
		return false;
		}
		}
	
	public void actualizarLimite(double limiteNuevo)
	{
		double result;
		if(limiteNuevo<this.getLimiteDeCompra())
		{
			result=limiteNuevo-(this.getLimiteDeCompra()-this.getDisponible());
			this.setLimiteDeCompra(limiteNuevo);
			if(result<0)
			this.setDisponible(0);
			else
				this.setDisponible(result);
		}
		else
		{
			this.setLimiteDeCompra(limiteNuevo);
		}
		
	}
	
}
