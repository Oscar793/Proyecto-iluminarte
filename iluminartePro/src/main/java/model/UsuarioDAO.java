package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

	Connection con; //objeto de conexión
	PreparedStatement ps; //objeto para sentencias preparadas
	ResultSet rs; //objeto para almacenar consultas
	String sql=null; //variable para guardar sentencias
	
	Conexion c=new Conexion();
	
	int r;

	public List Listar() throws SQLException {
		List<Usuario> usu=new ArrayList<>();
		sql="SELECT idUsuario, idtipoDocumentoFK,idRolFK, nombreUsuario, apellidoUsuario,contrasenaUsuario,numeroIdentificacionUsuario,direccionUsuario, telefonoUsuario, correoUsuario, estadoUsuario FROM usuario \r\n"
				+ "JOIN tiporol ON tiporol.idRol=usuario.idRolFK\r\n"
				+ "JOIN tipodocumento ON tipodocumento.idTipoDocumento = usuario.idTipoDocumentoFK;";
		
		try {
			con=c.conectar(); //abrir conexion
			ps=con.prepareStatement(sql); //preparando la sentencia
			//ejecutamos la consulta y guardamos en el objeto rs
			rs=ps.executeQuery();
			//procesamos el resultado de la consulta
			while(rs.next()) {
				Usuario u=new Usuario();
				//Escribir en el setter de cada objeto
				u.setIdUsuario(rs.getInt(1));
				
				u.setIdTipodeDocumentoFK(new TipoDocumento());
				u.getIdTipodeDocumentoFK().setNombreTipoDocumento(rs.getString(2));
				
				u.setIdRolFK(new TipoRol());
				u.getIdRolFK().setNombreRol(rs.getString(3));
				
				u.setNombreUsuario(rs.getString(4));
				u.setApellidoUsuario(rs.getString(5));
				u.setContrasenaUsuario(rs.getString(6));
				u.setNumerodeIdentificacionUsuario(rs.getString(7));
				u.setDireccionUsuario(rs.getString(8));
				u.setTelefonoUsuario(rs.getString(9));				
				u.setCorreoUsuario(rs.getString(10));
				u.setEstadoUsuario(rs.getBoolean(11));
				
				usu.add(u);
			}
			ps.close(); //cerrar sentencia
			System.out.println("consulta exitosa");
		}catch(Exception e) {
			System.out.println("No existen usuarios definidos"+e.getMessage());
		}finally {
			con.close(); //cerrar conexión
		}
		return usu;
	}
	
}
