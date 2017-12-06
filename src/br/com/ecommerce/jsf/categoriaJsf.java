package br.com.ecommerce.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.ecommerce.dao.ProdutoDao;
import br.com.ecommerce.dao.ProdutoDaoJpa;
import br.com.ecommerce.model.Produto;

@ManagedBean
public class categoriaJsf{
	
	private ProdutoDao pdao;
	private List<Produto> produtosCategoria;
	private List<String> categorias;
	private String categoria;
	
	public categoriaJsf() {
		pdao = new ProdutoDaoJpa();
		produtosCategoria = pdao.listarProdutos();
		categorias = new ArrayList<>();
		categoria = "";

	}

	public ProdutoDao getPdao() {
		return pdao;
	}

	public void setPdao(ProdutoDao pdao) {
		this.pdao = pdao;
	}

	public List<Produto> getProdutosCategoria() {
		produtosCategoria.clear();
		for (Produto produto : pdao.listarProdutos()) {
			if (produto.getCategoria().equals(getCategoria())) {
				produtosCategoria.add(produto);

			}
		}			
		
		return produtosCategoria;
	}

	public void setProdutosCategoria(List<Produto> produtosCategoria) {
		this.produtosCategoria = produtosCategoria;
	}

	public List<String> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<String> categorias) {
		this.categorias = categorias;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
	
	
}
