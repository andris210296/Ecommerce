package br.com.ecommerce.servlets;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import br.com.ecommerce.dao.ClienteDao;
import br.com.ecommerce.dao.ClienteDaoJpa;
import br.com.ecommerce.model.Cliente;

@WebServlet("/cadastrarCliente")
public class cadastrarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public cadastrarCliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String login = request.getParameter("login");
			String senha = request.getParameter("senha");
			String nome = request.getParameter("nome");
			String telefone = request.getParameter("telefone");
			String email = request.getParameter("email");

			ClienteDao cdao = new ClienteDaoJpa();

			Cliente cliente = new Cliente();
			cliente.setEmail(email);
			cliente.setLogin(login);
			cliente.setSenha(senha);
			cliente.setNome(nome);
			cliente.setTelefone(telefone);

			TimeUnit.SECONDS.sleep(1);

			String mensagem = "";
			mensagem = "Salvo com Sucesso";
			cdao.cadastrarCliente(cliente);
			request.setAttribute("login", cliente.getLogin());
			RequestDispatcher rd = request.getRequestDispatcher("login.xhtml");
			rd.forward(request, response);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
