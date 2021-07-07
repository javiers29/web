package es.curso.app.controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controlador
 */
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
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
		
		//Recoger el parametro del formulario
		String nombre = request.getParameter("nombre");
		String dni = request.getParameter("dni");
		
		nombre="Hola "+ nombre;
		dni= "Tu DNI es: " + dni;
		
		//Cargar parametros en la request;
		request.setAttribute("nombre", nombre);
		request.setAttribute("dni", dni);
		
		//Redirigir a la vista:
		RequestDispatcher rd = request.getRequestDispatcher("resul.jsp");
		rd.forward(request, response); //Cargar el recurso en el navegador
		
	}

}
