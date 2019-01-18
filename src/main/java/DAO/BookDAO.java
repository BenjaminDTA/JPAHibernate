package DAO;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import Modele.Book;
import Modele.Client;

public class BookDAO {
	public static void createBook(Book bk) {

		EntityManager em = DatabaseHelper.createEntityManager();
		DatabaseHelper.beginTx(em);
		em.persist(bk);
		DatabaseHelper.commitTxAndClose(em);

	}

	public static void updateBook(Book bk) {
		EntityManager em = DatabaseHelper.createEntityManager();
		DatabaseHelper.beginTx(em);
		em.merge(bk);
		DatabaseHelper.commitTxAndClose(em);

	}

	public static void deleteBook(Book bk) {
		EntityManager em = DatabaseHelper.createEntityManager();
		DatabaseHelper.beginTx(em);
		em.remove(bk);
		DatabaseHelper.commitTxAndClose(em);
	}
	
}
