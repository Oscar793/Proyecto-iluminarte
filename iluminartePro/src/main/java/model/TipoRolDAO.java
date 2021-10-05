package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TipoRolDAO {
	private Connection connection;
	private PreparedStatement statement;
	private boolean estadoOperacion;
	
	// Guardar
		public boolean guardar(TipoRol tiporol) throws SQLException {
			String sql=null;
			estadoOperacion=false;
			connection=obtenerConexion(); 
			
			try {
				connection.setAutoCommit(false);
				sql="INSERT INTO tiporol (idRol, nombreRol) VALUES (?,?)";
				statement=connection.prepareStatement(sql);
				
				statement.setString(1,null);
				statement.setString(2, tiporol.getNombreRol());		 
				
				
				estadoOperacion=statement.executeUpdate()>0;
				
				connection.commit();
				statement.close();
				connection.close();
				
			} catch (SQLException e) {
				connection.rollback();	
				e.printStackTrace();
			}
					
			
			return estadoOperacion;
		}
		
		
		// Editar producto
		public boolean editar(TipoRol tiporol) throws SQLException {
			String sql=null;
			estadoOperacion=false;
			connection=obtenerConexion();
			try {
				
				connection.setAutoCommit(false);
				sql="UPDATE tiporol SET nombreRol=? WHERE idRol=?";
				statement=connection.prepareStatement(sql);
				
				statement.setString(1, tiporol.getNombreRol());		
				statement.setInt(2, tiporol.getIdRol());
				
				estadoOperacion=statement.executeUpdate()>0;
				connection.commit();
				statement.close();
				connection.close();
				
					
		}catch (SQLException e) {
			connection.rollback();	
			e.printStackTrace();
		}	
				
			return estadoOperacion;
			}
			
			
	      // Eliminar producto
		  public boolean eliminar(TipoRol tiporol) throws SQLException {
			    String sql=null;
				estadoOperacion=false;
				connection=obtenerConexion();
				try {
					
					connection.setAutoCommit(false);
					sql="DELETE FROM tiporol WHERE idRol=?";
					statement=connection.prepareStatement(sql);
					
					statement.setInt(1, tiporol.getIdRol());
					
					estadoOperacion=statement.executeUpdate()>0;
					connection.commit();
					statement.close();
					connection.close();
					
						
			}catch (SQLException e) {
				connection.rollback();	
				e.printStackTrace();
			}	
					
				return estadoOperacion;
				}
				
		
		  
		  // Obtener lista de TipoRol
	      public List<TipoRol> obtenerTipoRoles() throws SQLException{
	    	 ResultSet resultSet=null;
	    	 List<TipoRol> listaTipoRol=new ArrayList<>();
	    	 
	    	  String sql=null;
			  estadoOperacion=false;
			  connection=obtenerConexion();
			  
			  try {
				  sql="SELECT * FROM tiporol";
				  statement=connection.prepareStatement(sql);
				  resultSet=statement.executeQuery(sql);
				  while (resultSet.next()) {
					  TipoRol p=new TipoRol();
					  p.setIdRol(resultSet.getInt(1));
					  p.setNombreRol(resultSet.getString(2));					  
					  listaTipoRol.add(p);
					  }
				  				
				}catch (SQLException e) {					
					e.printStackTrace();
					}	
						
					return listaTipoRol;
					}
		  
		  
	      // Obtener lista de producto
	      public TipoRol obtenerTipoRol(int idRol) throws SQLException{ ResultSet resultSet=null;
	      TipoRol p=new TipoRol();
		 
		  String sql=null;
		  estadoOperacion=false;
		  connection=obtenerConexion();
		  
		  try {
			  sql="SELECT * FROM tiporol WHERE idRol =?";
			  statement=connection.prepareStatement(sql);
			  statement.setInt(1, idRol);
			  
			  resultSet=statement.executeQuery(sql);
			  
			  if (resultSet.next()) {
				  
				  p.setIdRol(resultSet.getInt(1));
				  p.setNombreRol(resultSet.getString(2));				
				  }
			  				
			}catch (SQLException e) {					
				e.printStackTrace();
				}	
					
				return p;
				}
	 	
	      
		
		  
	      private Connection obtenerConexion() throws SQLException {
	    	  return Conexion.getConnection();
	      }
	
}