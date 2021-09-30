package model;

import java.util.Date;

public class Compra {
	
	private int idCompra;
	private int cantidadCompra;
	private Date fechaCompra;
	private Double subTotalCompra;
	private Double totalCompra;
	private String detalleCompra;
	private Pago idPagoFK;
	public Compra(int idCompra, int cantidadCompra, Date fechaCompra, Double subTotalCompra, Double totalCompra,
			String detalleCompra, Pago idPagoFK) {
		super();
		this.idCompra = idCompra;
		this.cantidadCompra = cantidadCompra;
		this.fechaCompra = fechaCompra;
		this.subTotalCompra = subTotalCompra;
		this.totalCompra = totalCompra;
		this.detalleCompra = detalleCompra;
		this.idPagoFK = idPagoFK;
	}
	public int getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	public int getCantidadCompra() {
		return cantidadCompra;
	}
	public void setCantidadCompra(int cantidadCompra) {
		this.cantidadCompra = cantidadCompra;
	}
	public Date getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public Double getSubTotalCompra() {
		return subTotalCompra;
	}
	public void setSubTotalCompra(Double subTotalCompra) {
		this.subTotalCompra = subTotalCompra;
	}
	public Double getTotalCompra() {
		return totalCompra;
	}
	public void setTotalCompra(Double totalCompra) {
		this.totalCompra = totalCompra;
	}
	public String getDetalleCompra() {
		return detalleCompra;
	}
	public void setDetalleCompra(String detalleCompra) {
		this.detalleCompra = detalleCompra;
	}
	public Pago getIdPagoFK() {
		return idPagoFK;
	}
	public void setIdPagoFK(Pago idPagoFK) {
		this.idPagoFK = idPagoFK;
	}
	
	

}
