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

import br.com.ecommerce.dao.ClienteDao;
import br.com.ecommerce.dao.ClienteDaoJpa;
import br.com.ecommerce.model.Cliente;


/**
 * Servlet implementation class alterarUsuario
 */
@WebServlet("/alterarCliente")
public class alterarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public alterarCliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String idString = request.getParameter("id");

		Long id = Long.parseLong(idString);

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		
		ClienteDao cdao = new ClienteDaoJpa();

		Cliente cliente = new Cliente();
		cliente.setId(id);		
		cliente.setLogin(login);
		cliente.setSenha(senha);
		cliente.setNome(nome);
		cliente.setTelefone(telefone);
		cliente.setEmail(email);

		cdao.editar(cliente);

		if (cliente.getId() != null) {

			request.setAttribute("id", cliente.getId());
			request.setAttribute("login", cliente.getLogin());
			request.setAttribute("senha", cliente.getSenha());
			request.setAttribute("nome", cliente.getNome());
			request.setAttribute("telefone", cliente.getTelefone());
			request.setAttribute("email", cliente.getEmail());
						
			RequestDispatcher rd = request.getRequestDispatcher("login.xhtml");
			rd.forward(request, response);
		}
	}
}
