package parcialDosTest;

public class Pedido {
	private int nroPedido;
	private int codigo;
	private int cantidad;
	private float importe;
	private int cantPendiendte;
	private String estado;
	public int getNroPedido() {
		return nroPedido;
	}
	public void setNroPedido(int nroPedido) {
		this.nroPedido = nroPedido;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}
	public int getCantPendiendte() {
		return cantPendiendte;
	}
	public void setCantPendiendte(int cantPendiendte) {
		this.cantPendiendte = cantPendiendte;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Pedido(int nroPedido, int codigo, int cantidad, float importe, int cantPendiendte, String estado) {
		super();
		this.nroPedido = nroPedido;
		this.codigo = codigo;
		this.cantidad = cantidad;
		this.importe = importe;
		this.cantPendiendte = cantidad;
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Pedido [nroPedido=" + nroPedido + ", codigo=" + codigo + ", cantidad=" + cantidad + ", importe="
				+ importe + ", cantPendiendte=" + cantPendiendte + ", estado=" + estado + "]";
	}
	
	
	
	
	
}
