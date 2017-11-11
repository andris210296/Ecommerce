package br.com.ecommerce.dao;
import java.util.List;

import br.com.ecommerce.model.Cliente;
import br.com.ecommerce.model.*;

public interface ClienteDao {
	
	public void cadastrarCliente(Cliente cliente);
	public List<Cliente> pesquisarCliente(String nome);
	public boolean encontrar(Cliente cliente);
	public Cliente logar(String login,String senha);
	public Cliente cliente(Long id);
	void editar(Cliente cliente);
	

}
