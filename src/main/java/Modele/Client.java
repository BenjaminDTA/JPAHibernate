package Modele;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Client {
	@Id
	@GeneratedValue
	@Column
	private Integer id;

	@Column
	private String lastname;
	@Column
	private String firstname;
	@Column
	private String gender;
	@ManyToOne
	private Book livrepref;
	
	@ManyToMany
	private List<Book> achatBook;


	public Client() {
	}

	public Client(String lastname, String firstname, String gender) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.gender = gender;
		this.achatBook = new ArrayList<Book>();

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Book getLivrepref() {
		return livrepref;
	}

	public void setLivrepref(Book livrepref) {
		this.livrepref = livrepref;
	}

	public void achat(Book b) {
		achatBook.add(b);
	}

	public List<Book> getAchatBook() {
		return achatBook;
	}
	
}