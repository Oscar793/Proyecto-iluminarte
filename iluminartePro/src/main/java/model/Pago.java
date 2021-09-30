package model;

public class Pago {

	private int idPago;
	private String estadoPago;
	private String tipoPago;
	private Double valorPago;
	private Double porcentajeIvaPago;
	private Pedido idPedidoFK;
	public Pago(int idPago, String estadoPago, String tipoPago, Double valorPago, Double porcentajeIvaPago,
			Pedido idPedidoFK) {
		super();
		this.idPago = idPago;
		this.estadoPago = estadoPago;
		this.tipoPago = tipoPago;
		this.valorPago = valorPago;
		this.porcentajeIvaPago = porcentajeIvaPago;
		this.idPedidoFK = idPedidoFK;
	}
	public int getIdPago() {
		return idPago;
	}
	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}
	public String getEstadoPago() {
		return estadoPago;
	}
	public void setEstadoPago(String estadoPago) {
		this.estadoPago = estadoPago;
	}
	public String getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}
	public Double getValorPago() {
		return valorPago;
	}
	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}
	public Double getPorcentajeIvaPago() {
		return porcentajeIvaPago;
	}
	public void setPorcentajeIvaPago(Double porcentajeIvaPago) {
		this.porcentajeIvaPago = porcentajeIvaPago;
	}
	public Pedido getIdPedidoFK() {
		return idPedidoFK;
	}
	public void setIdPedidoFK(Pedido idPedidoFK) {
		this.idPedidoFK = idPedidoFK;
	}
	
	
}
