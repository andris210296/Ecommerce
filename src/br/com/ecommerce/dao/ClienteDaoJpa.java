package br.com.ecommerce.dao;

import java.util.List;

import javax.persistence.*;

import br.com.ecommerce.model.Cliente;


public class ClienteDaoJpa implements ClienteDao {

	private EntityManagerFactory factory;
	private EntityManager manager;

	public ClienteDaoJpa() {
		factory = Persistence.createEntityManagerFactory("ecommerce");
		manager = factory.createEntityManager();
	}

	@Override
	public void cadastrarCliente(Cliente cliente) {
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.getTransaction().commit();

	}

	@Override
	public List<Cliente> pesquisarCliente(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean encontrar(Cliente cliente) {		
		Query query = manager
				.createQuery("SELECT c FROM Cliente c WHERE c.login = :plogin");
		query.setParameter("plogin", cliente.getLogin());
		return true;
		
	}

	@Override
	public void editar(Cliente cliente) {
		manager.getTransaction().begin();
		manager.merge(cliente);
		manager.getTransaction().commit();

	}

	@Override
	public Cliente logar(String login, String senha) {
		
		try{
		Query query = manager
				.createQuery("SELECT c FROM Cliente c WHERE c.login = :plogin AND u.senha = :psenha");
		query.setParameter("plogin", login);
		query.setParameter("psenha", senha);

		Cliente cliente =  (Cliente) query.getSingleResult();
		
		return cliente;
		}
		catch(Exception e){
			
			Cliente vaziocliente = new Cliente();
			return vaziocliente;			
		}
		
	}

	@Override
	public Cliente cliente(Long id) {
		Query query = manager
				.createQuery("SELECT c FROM Usuario c WHERE c.id = :pid");
		query.setParameter("pid", id);
		
		Cliente cliente =  (Cliente) query.getSingleResult();
		
		return cliente;
	}

}
