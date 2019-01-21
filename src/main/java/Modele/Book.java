package modele;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Book {
	
	@Id
	@GeneratedValue()
	private Integer id;
	@Column
	private String title;
	@Column
	private String author;
	@OneToMany(mappedBy = "livrepref")
	private List<Client> clients;
	
	
	@ManyToMany (mappedBy = "achatBook")
	private List<Client> achatClient;
	

	public Book() {
		super();
	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	

}