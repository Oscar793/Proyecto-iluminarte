package model;


public class Producto {
	
	private int idProducto;
	private String nombreProducto;
	private Double precioProducto;
	private String descripcionProducto;
	private String imagenProducto;
	private Categoria idCategoriaPK;
	private Proveedor idProveedorPK;
	public Producto(int idProducto, String nombreProducto, Double precioProducto, String descripcionProducto,
			String imagenProducto, Categoria idCategoriaPK, Proveedor idProveedorPK) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.descripcionProducto = descripcionProducto;
		this.imagenProducto = imagenProducto;
		this.idCategoriaPK = idCategoriaPK;
		this.idProveedorPK = idProveedorPK;
	}
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public Double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(Double precioProducto) {
		this.precioProducto = precioProducto;
	}
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	public String getImagenProducto() {
		return imagenProducto;
	}
	public void setImagenProducto(String imagenProducto) {
		this.imagenProducto = imagenProducto;
	}
	public Categoria getIdCategoriaPK() {
		return idCategoriaPK;
	}
	public void setIdCategoriaPK(Categoria idCategoriaPK) {
		this.idCategoriaPK = idCategoriaPK;
	}
	public Proveedor getIdProveedorPK() {
		return idProveedorPK;
	}
	public void setIdProveedorPK(Proveedor idProveedorPK) {
		this.idProveedorPK = idProveedorPK;
	}
	
	

}
