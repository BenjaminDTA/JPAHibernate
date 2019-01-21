package modele;


import javax.persistence.EntityManager;

import dao.ClientDAO;
import dao.DatabaseHelper;

public class Main {

	public void main() {

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
