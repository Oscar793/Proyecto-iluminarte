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
	public Usuario validar(String correoUsuario, String nombreUsuario ) {
		Usuario us=new Usuario();
		sql="SELECT * FROM usuario where correoUsuario=? and nombreUsuario=?";
		try {
			con=c.conectar();
			ps=con.prepareStatement(sql);
			ps.setString(1, correoUsuario);
			ps.setString(2, nombreUsuario);
			rs=ps.executeQuery();
			while(rs.next()) {
				us.setNombreUsuario(rs.getString("nombreUsuario"));
				us.setApellidoUsuario(rs.getString("apellidoUsuario"));
				us.setCorreoUsuario(rs.getString("correoUsuario"));
			}
			
		}catch (Exception e){
			
		}
		return us;
	}
	
	public List Listar() throws SQLException {
		List<Usuario> usu=new ArrayList<>();
		sql="SELECT idUsuario, nombreTipoDocumento,nombreRol, nombreUsuario, apellidoUsuario,contrasenaUsuario , "
				+ "numeroIdentificacionUsuario,direccionUsuario, telefonoUsuario, correoUsuario, estadoUsuario  " 
				+ "FROM usuario JOIN tiporol ON tiporol.idRol=usuario.idRolFK JOIN tipodocumento ON tipodocumento.idTipoDocumento = usuario.idTipoDocumentoFK";
		
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
	public int registrar(Usuario us) throws SQLException {
		sql="INSERT INTO usuario (idtipoDocumentoFK,idRolFK, nombreUsuario, apellidoUsuario,contrasenaUsuario,numeroIdentificacionUsuario,direccionUsuario, telefonoUsuario, correoUsuario, estadoUsuario) VALUES (?,?,?,?,?,?,?,?,?,?)";
		try {
			con=c.conectar();//abrir conexión
			ps=con.prepareStatement(sql); //preparación
			
			ps.setInt(1,us.getIdTipodeDocumentoFK().getIdTipoDocumento());
			ps.setInt(2,us.getIdRolFK().getIdRol());
			
			ps.setString(3, us.getNombreUsuario());
			ps.setString(4, us.getApellidoUsuario());
			ps.setString(5, us.getContrasenaUsuario());
			ps.setString(6, us.getNumerodeIdentificacionUsuario());
			ps.setString(7, us.getDireccionUsuario());
			ps.setString(8, us.getTelefonoUsuario());
			ps.setString(9, us.getCorreoUsuario());
			ps.setBoolean(10, us.isEstadoUsuario());
			
			System.out.println(ps);
			ps.executeUpdate();//Ejecucución sentencia
			ps.close();//cerrar sentencia
			System.out.println("Se registró un usuario");
			
		}catch(Exception e) {
			System.out.println("Error en el registro del usuario "+e.getMessage());
		}
		finally {
			con.close();
		}
		return r;
	}

	
	public void eliminar(int id) throws SQLException {
		sql="DELETE FROM usuario WHERE idUsuario="+id;
		System.out.println(sql);
		try {
			con=c.conectar();
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
			ps.close();
			System.out.println("Se eliminó el usuario");
		}catch(Exception e) {
			System.out.println("Error en la eliminación del registro "+e.getMessage());
		}
		finally {
			con.close();
		}
	}
	
	public Usuario consultaporId(int id) throws SQLException {
		Usuario u=new Usuario();
		sql="SELECT * FROM usuario WHERE idUsuario="+id;
		try {
			con=c.conectar();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			System.out.println(ps);
			
			while(rs.next()) {
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
				System.out.println("Se encontró el usuario");
				
			}
		}catch(Exception e) {
			System.out.println("Error en la consulta del usuario "+e.getMessage());
		}
		finally {
			con.close();
		}
		
		return u;
	}
	
	public int actualizar(Usuario us) throws SQLException {
		sql="UPDATE usuario SET idtipoDocumentoFK=?,idRolFK=?, nombreUsuario=?, apellidoUsuario=?,contrasenaUsuario=?,numeroIdentificacionUsuario=?,direccionUsuario=?, telefonoUsuario=?, correoUsuario=?, estadoUsuario=? "+
				"WHERE idUsuario="+us.getIdUsuario();
		try {
			
			con=c.conectar();//abrir conexión
			ps=con.prepareStatement(sql); //preparación
			ps.setInt(1, us.getIdTipodeDocumentoFK().getIdTipoDocumento());
			ps.setInt(2, us.getIdRolFK().getIdRol());
			ps.setString(3, us.getNombreUsuario());
			ps.setString(4, us.getApellidoUsuario());
			ps.setString(5, us.getContrasenaUsuario());
			ps.setString(6, us.getNumerodeIdentificacionUsuario());			
			ps.setString(7, us.getDireccionUsuario());
			ps.setString(8, us.getTelefonoUsuario());
			ps.setString(9, us.getCorreoUsuario());
			ps.setBoolean(10, us.isEstadoUsuario());


			
			System.out.println(ps);
			ps.executeUpdate();//Ejecucución sentencia
			ps.close();//cerrar sentencia
			System.out.println("Se actualizó un usuario");
		}catch(Exception e) {
			System.out.println("Error en la actualización del usuario "+e.getMessage());
		}
		finally {
			con.close();
		}
		return r;
	}
	
	
	public int cambiarEstado(Boolean es, int id) throws SQLException {
		sql="UPDATE usuario SET estadoUsuario=" + es +
				" WHERE idUsuario=" + id;
		try {
			
			con=c.conectar();//abrir conexión
			ps=con.prepareStatement(sql); //preparación
			/*ps.setBoolean(1, u.isEstadoUsuario());*/
			
			
			System.out.println(ps);
			ps.executeUpdate();//Ejecucución sentencia
			
			/*ps.close();//cerrar sentencia*/
			
			System.out.println("Se actualizó el estado del usuario");
		}catch(Exception e) {
			System.out.println("Error en la actualización del estado usuario "+e.getMessage());
		}
		finally {
			con.close();
		}
		return r;
	}

}