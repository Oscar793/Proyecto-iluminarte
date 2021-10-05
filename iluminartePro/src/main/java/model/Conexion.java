/*package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/db_iluminarte";
	private static final String USUARIO = "root";
	private static final String CLAVE = "";
	

	public Connection conectar() {		
		Connection conexion = null;
				
		try { 
			Class.forName(CONTROLADOR);			
			conexion = DriverManager.getConnection(URL,USUARIO,CLAVE);			
			System.out.print("ConexiÃ³n OK");
			
		}catch (ClassNotFoundException e) {
			System.out.print("Error al cargar el controlador");
			e.printStackTrace();
			
		}catch (SQLException e) {
			System.out.print("Error en la conexiÃ³n");
			e.printStackTrace();
		}
		
		return conexion;
	}
	
	public static void main(String[] args) {
		

	}

}*/



/*package model;

import java.sql.*;

public class Conexion {
	
	private static final String bbdd="jdbc:mysql://localhost:3306/db_iluminarte";
	private static final String usuario="root";
	private static final String clave="";
	private static Connection con;
	
	
	public static Connection conectar() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(bbdd,usuario,clave);
			 System.out.println("Conexión Exitosa");
		}catch(Exception e) {
			System.out.println("Error de conexión a la base de datos "+e.getMessage().toString());			
		}
		return con;
		
	}
}*/

package model;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;


public class Conexion {
	private static  BasicDataSource dataSource=null;
	
	private static DataSource getDataSource() {
		if (dataSource==null) {
			dataSource=new BasicDataSource();
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSource.setUsername("root");
			dataSource.setPassword("");
			dataSource.setUrl("jdbc:mysql://localhost:3306/db_iluminarte");
			dataSource.setInitialSize(20);
			dataSource.setMaxIdle(15);
			dataSource.setMaxTotal(20);		
		}
		return dataSource;
	}
	
	public static Connection getConnection() throws SQLException{
		return getDataSource().getConnection(); 
	}
}














