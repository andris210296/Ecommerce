package br.com.ecommerce.model;

import javax.persistence.*;

public class GeraTabelas {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecommerce");

		factory.close();
	}
}
