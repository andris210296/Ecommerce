package br.com.ecommerce.servlets;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ecommerce.dao.ProdutoDao;
import br.com.ecommerce.dao.ProdutoDaoJpa;
import br.com.ecommerce.model.Produto;

@WebServlet("/cadastrarProduto")
public class cadastrarProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public cadastrarProduto() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String categoria = request.getParameter("categoria");
		String descricao = request.getParameter("descricao");
		int destaque = Integer.valueOf(request.getParameter("destaque"));
		String especificacao = request.getParameter("especificacao");
		String foto = request.getParameter("foto");
		double preco_unitario = Double.valueOf(request.getParameter("preco_unitario"));

		ProdutoDao pdao = new ProdutoDaoJpa();

		Produto produto = new Produto();
		produto.setCategoria(categoria);
		produto.setDescricao(descricao);
		produto.setDestaque(destaque);
		produto.setEspecificacao(especificacao);
		produto.setFoto(foto);
		produto.setPreco_unitario(preco_unitario);


		String mensagem = "";
		mensagem = "Salvo com Sucesso";
		pdao.cadastrarProduto(produto);
		request.setAttribute("mensagem", mensagem);
		RequestDispatcher rd = request.getRequestDispatcher("index.xhtml");
		rd.forward(request, response);

	}
}
