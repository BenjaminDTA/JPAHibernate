package dao;


import javax.persistence.EntityManager;

import modele.Book;

public class BookDAO {
	
	private BookDAO() {
	}
	
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
