package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="Book1")
@NamedQueries(@NamedQuery(name="getAllBooks",query="SELECT book FROM book"))
public class Book implements Serializable {
	private static final long serialVersionUID=1L;
	
	private Integer id;
	private String title;
	private String auther;
	private Double price;
	public Integer getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return String.format("Book [id=%s, title=%s, auther=%s, price=%s]", id, title, auther, price);
	}
	
	
}
