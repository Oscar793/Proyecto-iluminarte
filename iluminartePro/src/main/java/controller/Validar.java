package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import model.UsuarioDAO;

/**
 * Servlet implementation class Validar
 * Validacion Login
 */
@WebServlet("/Validar")
public class Validar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    UsuarioDAO udao=new UsuarioDAO();
    Usuario us=new Usuario();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String accion=request.getParameter("accion");
		if (accion.equalsIgnoreCase("Ingresar")) {
			String user=request.getParameter("txtuser");
			String pass=request.getParameter("txtpass");
			us=udao.validar(user, pass);
			if (us.getNombreUsuario()!=null) {
				 request.getRequestDispatcher("views/usuario.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
