package dao;
import java.util.List;
import model.Book;
import model.Category;


public interface BookDAO {
		public void findAllBooks();
		
		public void searchBooksByKeyword(String keyword);
		
		public List<Category> findAllCategories();
		
		public void insert(Book book);
		
		public void update(Book book);
		
		public void delete(Long bookId);
		
		public void searchByAuthor(String name);
}
