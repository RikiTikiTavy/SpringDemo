package client;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;



import dao.BookDAO;
import dao.BookDAOImpl;
import model.Book;

public class BookApp {
		private static BookDAO bookDao = new BookDAOImpl();
		
		public static void main(String[] args){
			System.err.println("Listing books");
			bookDao.findAllBooks();
			System.out.println();
			
			
			bookDao.searchBooksByKeyword("Groovy");
			System.out.println();
			
			//This method doing nothing
			bookDao.searchByAuthor("Luke");
		
		}
		

}
