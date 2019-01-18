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
	private String Title;
	@Column
	private String Author;
	@OneToMany(mappedBy = "livrepref")
	private List<Client> clients;
	
	
	@ManyToMany (mappedBy = "achatBook")
	private List<Client> achatClient;
	

	public Book() {
		super();
	}

	public Book(String title, String author) {
		super();
		Title = title;
		Author = author;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	
	

}