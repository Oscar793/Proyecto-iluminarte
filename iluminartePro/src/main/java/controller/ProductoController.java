package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Producto;
import model.ProductoDAO;
import model.TipoRol;


/**
 * Servlet implementation class Producto
 */
@WebServlet("/Productos")
public class ProductoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String opcion = request.getParameter("opcion");
		if (opcion.equals("crear")) {
			System.out.println("usted a presionado la opcion crear");
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("/views/crear.jsp");
			requestDispatcher.forward(request, response);
			
						
		} else if (opcion.equals("listar")) {
			
		ProductoDAO productoDAO= new ProductoDAO();
		List<Producto> lista= new ArrayList<>();
		try {
			lista=productoDAO.obtenerProductos();
			
			for (Producto producto : lista) {
				System.out.println(producto);
			}
			
			request.setAttribute("lista", lista);
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("/views/listar.jsp");
			requestDispatcher.forward(request, response);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Usted a presionado la opcion listar");
			
		} else if (opcion.equals("meditar")) {
			int id = Integer.parseInt(request.getParameter("id"));
			System.out.println("Editar id: " + id); 
			ProductoDAO productoDAO = new ProductoDAO();
			Producto p = new Producto();
			try {
				p = productoDAO.obtenerProducto(id);
				System.out.println(p);
				request.setAttribute("producto", p);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/editar.jsp");
				requestDispatcher.forward(request, response);

				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
						
			
		}
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String opcion= request.getParameter("opcion");
		ProductoDAO productoDAO= new ProductoDAO();
		Producto producto= new Producto();
		producto.setNombreProducto(request.getParameter("nombre"));
		producto.setPrecioProducto(Double.parseDouble(request.getParameter("Precio")));
		producto.setDescripcionProducto(request.getParameter("Descripcion"));
		producto.setImagenProducto(request.getParameter("Imagen"));
				
		try {
			productoDAO.guardar(producto);
			System.out.println("Registro Guardado exitosamente");
			
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("/index.jsp");
			requestDispatcher.forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//doGet(request, response);
	}



}
