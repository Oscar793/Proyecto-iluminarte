package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProductoDAO {
	private Connection connection;
	private PreparedStatement statement;
	private boolean estadoOperacion;
	
	// Guardar
	public boolean guardar(Producto producto) throws SQLException {
		String sql=null;
		estadoOperacion=false;
		connection=obtenerConexion();
		
		try {
			connection.setAutoCommit(false);
			sql="INSERT INTO producto (idProducto, nombreProducto, precioProducto, descripcionProducto, imagenProducto) VALUES (?,?,?,?,?)";
			statement=connection.prepareStatement(sql);
			
			statement.setString(1, null);
			statement.setString(2, producto.getNombreProducto());		
			statement.setDouble(3, producto.getPrecioProducto());
			statement.setString(4, producto.getDescripcionProducto());
			statement.setString(5, producto.getImagenProducto());

			
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
	public boolean editar(Producto producto) throws SQLException {
		String sql=null;
		estadoOperacion=false;
		connection=obtenerConexion();
		try {
			
			connection.setAutoCommit(false);
			sql="UPDATE producto SET nombreProducto=?, precioProducto=?, descripcionProducto=?, imagenProducto=? WHERE idProducto=?";
			statement=connection.prepareStatement(sql);
			
			statement.setString(1, producto.getNombreProducto());		
			statement.setDouble(2, producto.getPrecioProducto());
			statement.setString(3, producto.getDescripcionProducto());
			statement.setString(4, producto.getImagenProducto());
			statement.setInt(5, producto.getIdProducto());
			
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
	  public boolean eliminar(Producto producto) throws SQLException {
		    String sql=null;
			estadoOperacion=false;
			connection=obtenerConexion();
			try {
				
				connection.setAutoCommit(false);
				sql="DELETE FROM producto WHERE idProducto=?";
				statement=connection.prepareStatement(sql);
				
				statement.setInt(1, producto.getIdProducto());
				
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
			
	
	  
	  // Obtener lista de productos
      public List<Producto> obtenerProductos() throws SQLException{
    	 ResultSet resultSet=null;
    	 List<Producto> listaProductos=new ArrayList<>();
    	 
    	  String sql=null;
		  estadoOperacion=false;
		  connection=obtenerConexion();
		  
		  try {
			  sql="SELECT * FROM producto";
			  statement=connection.prepareStatement(sql);
			  resultSet=statement.executeQuery(sql);
			  while (resultSet.next()) {
				  Producto p=new Producto();
				  p.setIdProducto(resultSet.getInt(1));
				  p.setNombreProducto(resultSet.getString(2));
				  p.setPrecioProducto(resultSet.getDouble(3));
				  p.setDescripcionProducto(resultSet.getString(4));
				  p.setImagenProducto(resultSet.getString(5));
				  listaProductos.add(p);
				  }
			  				
			}catch (SQLException e) {					
				e.printStackTrace();
				}	
					
				return listaProductos;
				}
	  
	  
      // Obtener lista de producto
      public Producto obtenerProducto(int idProducto) throws SQLException{ ResultSet resultSet=null;
      Producto p=new Producto();
	 
	  String sql=null;
	  estadoOperacion=false;
	  connection=obtenerConexion();
	  
	  try {
		  sql="SELECT * FROM producto WHERE idProducto =?";
		  statement=connection.prepareStatement(sql);
		  statement.setInt(1, idProducto);
		  
		  resultSet=statement.executeQuery(sql);
		  
		  if (resultSet.next()) {
			  
			  p.setIdProducto(resultSet.getInt(1));
			  p.setNombreProducto(resultSet.getString(2));
			  p.setPrecioProducto(resultSet.getDouble(3));
			  p.setDescripcionProducto(resultSet.getString(4));
			  p.setImagenProducto(resultSet.getString(5));
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
