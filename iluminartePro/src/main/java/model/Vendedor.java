package model;

public class Vendedor extends Usuario{
	
	private int idVendedor;
	private String tipoVendedor;
	private Usuario idUsuarioFK;
	public Vendedor(int idUsuario, String nombreUsuario, String apellidoUsuario, String contrasenaUsuario,
			String numeroIdentificacionUsuario, String direccionUsuario, String telefonoUsuario, String correoUsuario,
			int estadoUsuario, int idTipoDocumentoFK, int idRolFK, int idVendedor, String tipoVendedor,
			Usuario idUsuarioFK) {
		super(idUsuario, nombreUsuario, apellidoUsuario, contrasenaUsuario, numeroIdentificacionUsuario,
				direccionUsuario, telefonoUsuario, correoUsuario, estadoUsuario, idTipoDocumentoFK, idRolFK);
		this.idVendedor = idVendedor;
		this.tipoVendedor = tipoVendedor;
		this.idUsuarioFK = idUsuarioFK;
	}
	public int getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}
	public String getTipoVendedor() {
		return tipoVendedor;
	}
	public void setTipoVendedor(String tipoVendedor) {
		this.tipoVendedor = tipoVendedor;
	}
	public Usuario getIdUsuarioFK() {
		return idUsuarioFK;
	}
	public void setIdUsuarioFK(Usuario idUsuarioFK) {
		this.idUsuarioFK = idUsuarioFK;
	}

	

}
