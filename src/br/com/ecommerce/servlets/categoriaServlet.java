package br.com.ecommerce.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ecommerce.jsf.categoriaJsf;

/**
 * Servlet implementation class CategoriaServlet
 */
@WebServlet("/categoriaServlet")
public class categoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String categoria;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public categoriaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		categoria = request.getParameter("categoria");

		categoriaJsf categoriaJsf = new categoriaJsf();
		categoriaJsf.setCategoria(categoria);

		request.setAttribute("categoria", categoria);
		RequestDispatcher rd = request.getRequestDispatcher("categoria.xhtml");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
