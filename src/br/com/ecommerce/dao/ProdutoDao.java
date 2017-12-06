package br.com.ecommerce.dao;

import java.util.List;

import br.com.ecommerce.model.Produto;


public interface ProdutoDao {
	
	public void cadastrarProduto(Produto produto);
	public List<Produto> listarProdutos();
	public void deletarTudo();
	

}
