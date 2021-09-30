package model;

public class DetallePedido {
	
	private int idDetallePedido;
	private Pedido idPedidoFK;
	private Producto idProductoFK;
	public DetallePedido(int idDetallePedido, Pedido idPedidoFK, Producto idProductoFK) {
		super();
		this.idDetallePedido = idDetallePedido;
		this.idPedidoFK = idPedidoFK;
		this.idProductoFK = idProductoFK;
	}
	public int getIdDetallePedido() {
		return idDetallePedido;
	}
	public void setIdDetallePedido(int idDetallePedido) {
		this.idDetallePedido = idDetallePedido;
	}
	public Pedido getIdPedidoFK() {
		return idPedidoFK;
	}
	public void setIdPedidoFK(Pedido idPedidoFK) {
		this.idPedidoFK = idPedidoFK;
	}
	public Producto getIdProductoFK() {
		return idProductoFK;
	}
	public void setIdProductoFK(Producto idProductoFK) {
		this.idProductoFK = idProductoFK;
	}

	
	
}
