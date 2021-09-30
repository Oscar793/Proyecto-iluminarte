package model;

public class Usuario {

	private int idUsuario;
	private String nombreUsuario;
	private String apellidoUsuario;
	private String contrasenaUsuario;
	private String numeroIdentificacionUsuario;
	private String direccionUsuario;
	private String telefonoUsuario;
	private String correoUsuario;
	private int estadoUsuario;
	private int idTipoDocumentoFK;
	private int idRolFK;
	public Usuario(int idUsuario, String nombreUsuario, String apellidoUsuario, String contrasenaUsuario,
			String numeroIdentificacionUsuario, String direccionUsuario, String telefonoUsuario, String correoUsuario,
			int estadoUsuario, int idTipoDocumentoFK, int idRolFK) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.contrasenaUsuario = contrasenaUsuario;
		this.numeroIdentificacionUsuario = numeroIdentificacionUsuario;
		this.direccionUsuario = direccionUsuario;
		this.telefonoUsuario = telefonoUsuario;
		this.correoUsuario = correoUsuario;
		this.estadoUsuario = estadoUsuario;
		this.idTipoDocumentoFK = idTipoDocumentoFK;
		this.idRolFK = idRolFK;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getApellidoUsuario() {
		return apellidoUsuario;
	}
	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}
	public String getContrasenaUsuario() {
		return contrasenaUsuario;
	}
	public void setContrasenaUsuario(String contrasenaUsuario) {
		this.contrasenaUsuario = contrasenaUsuario;
	}
	public String getNumeroIdentificacionUsuario() {
		return numeroIdentificacionUsuario;
	}
	public void setNumeroIdentificacionUsuario(String numeroIdentificacionUsuario) {
		this.numeroIdentificacionUsuario = numeroIdentificacionUsuario;
	}
	public String getDireccionUsuario() {
		return direccionUsuario;
	}
	public void setDireccionUsuario(String direccionUsuario) {
		this.direccionUsuario = direccionUsuario;
	}
	public String getTelefonoUsuario() {
		return telefonoUsuario;
	}
	public void setTelefonoUsuario(String telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}
	public String getCorreoUsuario() {
		return correoUsuario;
	}
	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}
	public int getEstadoUsuario() {
		return estadoUsuario;
	}
	public void setEstadoUsuario(int estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}
	public int getIdTipoDocumentoFK() {
		return idTipoDocumentoFK;
	}
	public void setIdTipoDocumentoFK(int idTipoDocumentoFK) {
		this.idTipoDocumentoFK = idTipoDocumentoFK;
	}
	public int getIdRolFK() {
		return idRolFK;
	}
	public void setIdRolFK(int idRolFK) {
		this.idRolFK = idRolFK;
	}
	
}
