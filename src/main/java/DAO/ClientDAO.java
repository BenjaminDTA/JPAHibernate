package dao;

import javax.persistence.EntityManager;

import modele.Client;

public class ClientDAO {
	
	private ClientDAO() {
		
	}
	
	public static void createClient(Client c) {
		EntityManager em = DatabaseHelper.createEntityManager();
		DatabaseHelper.beginTx(em);
		em.persist(c);
		DatabaseHelper.commitTxAndClose(em);
		
	}
	
	public static void updateClient(Client c) {
		EntityManager em = DatabaseHelper.createEntityManager();
		DatabaseHelper.beginTx(em);
		em.merge(c);
		DatabaseHelper.commitTxAndClose(em);
	}
	
	public static void deleteClient(Client c) {
		EntityManager em = DatabaseHelper.createEntityManager();
		DatabaseHelper.beginTx(em);
		em.remove(c);
		DatabaseHelper.commitTxAndClose(em);
	}
//	public static void 

}
