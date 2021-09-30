package model;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.List;

public class TipoRolDAO {
	/*Se requieren atributos para realizar las operaciones*/
		
		Connection con; //objeto de conexión
		PreparedStatement ps; //objeto para sentencias preparadas
		ResultSet rs; //objeto para almacenar consultas
		String sql=null; //variable para guardar sentencias
		
		Conexion c=new Conexion();
		
		int rows;

		
		public List listarRoles() throws Exception{
			
			List<TipoRol> roles=new ArrayList<>();
			sql="SELECT *FROM rolUsuario";
			
			try {
				con=c.conectar(); //abrir conexion
				ps=con.prepareStatement(sql); //preparando la sentencia
				//ejecutamos la consulta y guardamos en el objeto rs
				rs=ps.executeQuery();
				//procesamos el resultado de la consulta
				while(rs.next()) {
					TipoRol r=new TipoRol();
					//Escribir en el setter de cada objeto
					r.setIdRol(rs.getInt("idRolUsuario"));
					r.setNombreRol(rs.getString("descripcionRolUsuario"));
					
					
					roles.add(r);
				}
				ps.close(); //cerrar sentencia
				System.out.println("consulta exitosa");
			}catch(Exception e) {
				System.out.println("No existen roles definidos"+e.getMessage());
			}finally {
				con.close(); //cerrar conexión
			}
			return roles;
		}
	}
