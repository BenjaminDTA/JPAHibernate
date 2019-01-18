package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modele.Client;

public class ClientDAO {
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
