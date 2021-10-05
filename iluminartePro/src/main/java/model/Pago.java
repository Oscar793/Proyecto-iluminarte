package model;

public class Pago {

	private int idPago;
	private String estadoPago;
	private Double tipoPago;
	private Double pocentajeIvaPago;
	private Pedido idPedidoFK;
	public Pago(int idPago, String estadoPago, Double tipoPago, Double pocentajeIvaPago, Pedido idPedidoFK) {
		super();
		this.idPago = idPago;
		this.estadoPago = estadoPago;
		this.tipoPago = tipoPago;
		this.pocentajeIvaPago = pocentajeIvaPago;
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
	public Double getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(Double tipoPago) {
		this.tipoPago = tipoPago;
	}
	public Double getPocentajeIvaPago() {
		return pocentajeIvaPago;
	}
	public void setPocentajeIvaPago(Double pocentajeIvaPago) {
		this.pocentajeIvaPago = pocentajeIvaPago;
	}
	public Pedido getIdPedidoFK() {
		return idPedidoFK;
	}
	public void setIdPedidoFK(Pedido idPedidoFK) {
		this.idPedidoFK = idPedidoFK;
	}
	
	
	
}
