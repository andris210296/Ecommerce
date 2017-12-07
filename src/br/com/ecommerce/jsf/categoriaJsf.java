package br.com.ecommerce.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import br.com.ecommerce.dao.ProdutoDao;
import br.com.ecommerce.dao.ProdutoDaoJpa;
import br.com.ecommerce.model.Produto;

@ManagedBean
@SessionScoped
public class categoriaJsf{
	
	private ProdutoDao pdao;
	private List<Produto> produtosCategoria;
	private List<String> categorias;
	private String categoria;	
	
	private Produto produto;
	private List<Produto> carrinho;
	private float valorTotal;
	private int quantidade;
	
	public categoriaJsf() {
		pdao = new ProdutoDaoJpa();
		produtosCategoria = pdao.listarProdutos();
		categorias = new ArrayList<>();
		categoria = "";
		carrinho = new ArrayList<>();
		produto = new Produto();

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
	

	public void  adicionarCarrinho(Produto produto) {
		carrinho.add(produto);
		valorTotal += this.produto.getPreco_unitario() * quantidade;
	}

	public void removerCarrinho(Produto produto) {
		carrinho.remove(produto);
		valorTotal -= this.produto.getPreco_unitario();
	}
	
	

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(List<Produto> carrinho) {
		this.carrinho = carrinho;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	
}
