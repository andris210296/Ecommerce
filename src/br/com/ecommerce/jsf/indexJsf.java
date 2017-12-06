package br.com.ecommerce.jsf;

import java.io.IOException;

import java.util.*;

import javax.faces.bean.ManagedBean;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ecommerce.dao.ProdutoDao;
import br.com.ecommerce.dao.ProdutoDaoJpa;
import br.com.ecommerce.model.Produto;

/**
 * Servlet implementation class indexServlet
 * 
 * http://incepttechnologies.blogspot.com.br/p/view-parameters-in-jsf-20.html
 */
@ManagedBean
public class indexJsf {

	private ProdutoDao pdao;
	private List<Produto> produtos;
	private List<String> categorias;
	private List<Produto> destaques;

	public indexJsf() {
		pdao = new ProdutoDaoJpa();
		produtos = pdao.listarProdutos();
		categorias = new ArrayList<>();
		destaques = new ArrayList<>();

	}

	public ProdutoDao getPdao() {
		return pdao;
	}

	public void setPdao(ProdutoDao pdao) {
		this.pdao = pdao;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<String> getCategorias() {
		for (Produto produto : produtos) {
			if (!categorias.contains(produto.getCategoria()))
				categorias.add(produto.getCategoria());
		}
		return categorias;
	}

	public void setCategorias(List<String> categorias) {
		this.categorias = categorias;
	}

	public List<Produto> getDestaques() {
		destaques.clear();
		for (Produto produto : produtos) {
			if (produto.getDestaque() == 1) {
				destaques.add(produto);

			}
		}

		return destaques;
	}

	public void setDestaques(List<Produto> destaques) {
		this.destaques = destaques;
	}

}
