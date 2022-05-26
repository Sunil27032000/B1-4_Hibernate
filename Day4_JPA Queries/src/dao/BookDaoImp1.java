package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;



import entities.Book;

public class BookDaoImp1 implements BookDao {
	private EntityManager entityManager;
	

	public BookDaoImp1() {
		entityManager=JPAUtil.getEntityManager();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Book getBookById(int id) {
		Book book=entityManager.find(Book.class,id);
		return book;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		String qStr ="SELECT book FROM Book1 book WHERE book.title=:ptitle";
		TypedQuery<Book> query= entityManager.createQuery(qStr,Book.class);
		return query.getResultList();
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		String qStr ="SELECT book FROM Book1 book WHERE book.author=:pAuther";
		TypedQuery<Book> query= entityManager.createQuery(qStr,Book.class);
		query.setParameter("pAuthor", author);
		List<Book>booklist=query.getResultList();
		return booklist;
	}

	@Override
	public List<Book> getBookInPriceRange(double low, double high) {
		String qStr ="SELECT book FROM Book1 book WHERE book.price between:low and high";
		TypedQuery<Book> query= entityManager.createQuery(qStr,Book.class);
		query.setParameter("Low", low);
		query.setParameter("High", high);
		List<Book>booklist=query.getResultList();
		return booklist;
	}

	@Override
	public List<Book> getAllBooks() {
		Query query=entityManager.createNamedQuery("getAllBooks");
		@SuppressWarnings("unchecked")
		List<Book>booklist=query.getResultList();
		return booklist;
	}

	@Override
	public long getBooksCount() {
		String qStr="SELECT COUNT(book.id) FROM book1 book";
		TypedQuery<Long> query=entityManager.createQuery(qStr,Long.class);
		Long count=query.getSingleResult();
		return count;
	}

}
