package model;

public class Cliente extends Usuario{

	private int idCliente;
	private Usuario idUsuarioFK;
	private Divipola idMunicipioDivipolaFK;
	public Cliente(int idUsuario, String nombreUsuario, String apellidoUsuario, String contrasenaUsuario,
			String numeroIdentificacionUsuario, String direccionUsuario, String telefonoUsuario, String correoUsuario,
			int estadoUsuario, int idTipoDocumentoFK, int idRolFK, int idCliente, Usuario idUsuarioFK,
			Divipola idMunicipioDivipolaFK) {
		super(idUsuario, nombreUsuario, apellidoUsuario, contrasenaUsuario, numeroIdentificacionUsuario,
				direccionUsuario, telefonoUsuario, correoUsuario, estadoUsuario, idTipoDocumentoFK, idRolFK);
		this.idCliente = idCliente;
		this.idUsuarioFK = idUsuarioFK;
		this.idMunicipioDivipolaFK = idMunicipioDivipolaFK;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public Usuario getIdUsuarioFK() {
		return idUsuarioFK;
	}
	public void setIdUsuarioFK(Usuario idUsuarioFK) {
		this.idUsuarioFK = idUsuarioFK;
	}
	public Divipola getIdMunicipioDivipolaFK() {
		return idMunicipioDivipolaFK;
	}
	public void setIdMunicipioDivipolaFK(Divipola idMunicipioDivipolaFK) {
		this.idMunicipioDivipolaFK = idMunicipioDivipolaFK;
	}
	
	
}
