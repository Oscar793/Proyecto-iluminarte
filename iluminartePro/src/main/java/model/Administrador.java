package model;

public class Administrador extends Usuario{
	private int idAdministrador;
	private Usuario idUsuarioFK;
	public Administrador(int idUsuario, String nombreUsuario, String apellidoUsuario, String contrasenaUsuario,
			String numeroIdentificacionUsuario, String direccionUsuario, String telefonoUsuario, String correoUsuario,
			int estadoUsuario, int idTipoDocumentoFK, int idRolFK, int idAdministrador, Usuario idUsuarioFK) {
		super(idUsuario, nombreUsuario, apellidoUsuario, contrasenaUsuario, numeroIdentificacionUsuario,
				direccionUsuario, telefonoUsuario, correoUsuario, estadoUsuario, idTipoDocumentoFK, idRolFK);
		this.idAdministrador = idAdministrador;
		this.idUsuarioFK = idUsuarioFK;
	}
	public int getIdAdministrador() {
		return idAdministrador;
	}
	public void setIdAdministrador(int idAdministrador) {
		this.idAdministrador = idAdministrador;
	}
	public Usuario getIdUsuarioFK() {
		return idUsuarioFK;
	}
	public void setIdUsuarioFK(Usuario idUsuarioFK) {
		this.idUsuarioFK = idUsuarioFK;
	}
	

}
