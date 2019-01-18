package Modele;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import DAO.ClientDAO;
import DAO.DatabaseHelper;

public class main {

	public static void main(String[] args) throws SQLException {

		EntityManager em = DatabaseHelper.createEntityManager();

		em.getTransaction().begin();

		Book book = new Book("Titre", "Auteur"); // book: Transient
		book.setTitle("Le titre du livre");
		book.setAuthor("Le nom de l'auteur");

		Client c = new Client("Lastname", "Firstname", "Gender");
		c.setFirstname("Montet");
		c.setLastname("Benjamin");
		c.setGender("M");
		c.setLivrepref(book);

		em.persist(book); // book: Managed

		em.persist(c);
		em.getTransaction().commit();

		em.close();

		c.achat(book);
		//Mettre a jour le client modifié
		ClientDAO.updateClient(c);
		


	}
}
