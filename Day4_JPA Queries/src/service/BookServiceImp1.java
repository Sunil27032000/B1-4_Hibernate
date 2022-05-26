package service;

import java.util.List;

import dao.BookDao;
import dao.BookDaoImp1;
import entities.Book;

public class BookServiceImp1  implements BookService{

	private BookDao dao;
	
	
	public BookServiceImp1() {
		dao=new BookDaoImp1();
		
	}

	@Override
	public Book getBookById(int id) {
		
		return dao.getBookById(id) ;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBookInPriceRange(double low, double high) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getBooksCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
