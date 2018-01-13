package br.com.ecommerce.servlets;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.dbcp.pool2.UsageTracking;

import br.com.ecommerce.dao.ClienteDao;
import br.com.ecommerce.dao.ClienteDaoJpa;
import br.com.ecommerce.model.Cliente;


/**
 * Servlet implementation class logarUsuario
 */
@WebServlet("/logarCliente")
public class logarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public logarCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");		
		String senha = request.getParameter("senha");		
		
		ClienteDao cdao = new ClienteDaoJpa();
	
		Cliente cliente = cdao.logar(login,senha);
			
		if(cliente.getId() != null){
			
			request.setAttribute("id", cliente.getId());
			request.setAttribute("login", cliente.getLogin());
			request.setAttribute("senha", cliente.getSenha());
			request.setAttribute("nome", cliente.getNome());
			request.setAttribute("telefone", cliente.getTelefone());
			request.setAttribute("email", cliente.getEmail());
						
						
			request.setAttribute("login", cliente.getLogin());
			RequestDispatcher rd = request.getRequestDispatcher("login.xhtml");
			rd.forward(request, response);
			
		}else{
			
			request.setAttribute("login", "Não foi possível logar!");
			RequestDispatcher rd = request.getRequestDispatcher("login.xhtml");
			rd.forward(request, response);
		}
		
		
	}

}
