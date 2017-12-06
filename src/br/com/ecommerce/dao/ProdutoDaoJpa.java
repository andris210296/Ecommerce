package br.com.ecommerce.dao;

import java.util.List;

import javax.persistence.*;

import br.com.ecommerce.model.Produto;


public class ProdutoDaoJpa implements ProdutoDao {
	private EntityManagerFactory factory;
	private EntityManager manager;
	
	public ProdutoDaoJpa() {
		factory = Persistence.createEntityManagerFactory("ecommerce");
		manager = factory.createEntityManager();
	}
	
	
	@Override
	public void cadastrarProduto(Produto produto) {
		
		System.out.println(produto);
		
		manager.getTransaction().begin();
		manager.persist(produto);
		manager.getTransaction().commit();
		
	}

	@Override
	public List<Produto> listarProdutos() {
		
		List<Produto> lista = manager.createQuery("SELECT p FROM Produto p").getResultList();				
		return lista;
	}


	@Override
	public void deletarTudo() {
		manager.getTransaction().begin();
		Query q = (Query) manager.createQuery("delete from Produto");
		q.executeUpdate();
		manager.getTransaction().commit();
		
	}
	

}
