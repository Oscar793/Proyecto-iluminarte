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


import model.TipoRol;
import model.TipoRolDAO;

/**
 * Servlet implementation class TipoRol
 */
@WebServlet("/TipoRol")
public class TipoRolController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TipoRolController() {
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
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("/views/crearRol.jsp");
			requestDispatcher.forward(request, response);
			
						
		} else if (opcion.equals("listar")) {
			
			TipoRolDAO tiporolDAO= new TipoRolDAO();
			List<TipoRol> lista= new ArrayList<>();
			try {
				
				lista=tiporolDAO.obtenerTipoRoles();				
				for (TipoRol tiporol : lista) {
					System.out.println(tiporol);
				}
				
				request.setAttribute("lista", lista);
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("/views/listarRol.jsp");
				requestDispatcher.forward(request, response);
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 System.out.println("usted a presionado la opcion listar");
			
		}else if (opcion.equals("meditar")) {
			int id= Integer.parseInt(request.getParameter("idRol"));
			System.out.println("Editar id:" + id);
			TipoRolDAO tiporolDAO= new TipoRolDAO();
			TipoRol p=new TipoRol();
			try {
				p=tiporolDAO.obtenerTipoRol(id);
				System.out.println(p);				
				request.setAttribute("tiporol", p);
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("/views/editarRol.jsp");
				requestDispatcher.forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
			
		}
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String opcion= request.getParameter("opcion");
		TipoRolDAO tipoRolDAO= new TipoRolDAO();
		TipoRol tiporol= new TipoRol();
		tiporol.setNombreRol(request.getParameter("nombre"));
		
				
		try {
			tipoRolDAO.guardar(tiporol);
			System.out.println("Registro Guardado exitosamente");
			
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("/Roles.jsp");
			requestDispatcher.forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//doGet(request, response);
	}



}
