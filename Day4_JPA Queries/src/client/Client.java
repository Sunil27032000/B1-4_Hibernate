package client;

import service.BookService;
import service.BookServiceImp1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookService obj=new BookServiceImp1();
		System.out.println("Total No.Of Books");
		System.out.println("Total Books: "+obj.getBooksCount());
		
		System.out.println("Listing Book with Id:102");
		System.out.println("Total Books: "+obj.getBookById(102));
		System.out.println("Listing all Books:");
		System.out.println("Total Books: "+obj.getAllBooks());
		
		
		System.out.println("Book written by Nihal:");
		System.out.println("Total Books: "+obj.getAuthorBooks("Nihal"));
		
		
		System.out.println("Book by title:");
		System.out.println("Total Books: "+obj.getBookByTitle("Python"));
		
		System.out.println("Listing book between 200 to 500:");
		System.out.println("Total Books: "+obj.getBookInPriceRange(200, 500));
		
		

	}

}
