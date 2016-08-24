package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Book;
import model.Author;
import model.Category;

public class BookDAOImpl implements BookDAO{
		String URL = "root";
		String PASSWORD = "root";
		
		
		public Connection getConnection() throws SQLException {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/books", URL, PASSWORD);
		}
		
	
		private void closeConnection(Connection connection){
			if(connection == null) return;
			try{
				connection.close();
			} catch (SQLException e){
				System.err.println("Closing connection error");
			}
		}
		
		public void findAllBooks(){
	
			String sql = "SELECT * FROM book";
			
			Connection connection = null;
		//TODO: use try-with-resources	
			try{
				connection = getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql);
				
				while(resultSet.next()){
					System.out.println("Book id: " + resultSet.getInt(1) + "  Book title: " + 
											resultSet.getString("BOOK_TITLE"));
				}
			} catch(SQLException e){
				e.printStackTrace();
			} finally {
				closeConnection(connection);
			}
		}
		
		
		
		public void searchByAuthor(String name){
			try{
				Connection conn = getConnection();
				String query = "SELECT * FROM author";
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			
				while(resultSet.next()){
					if(resultSet.getString("FIRST_NAME").contains(name)){
						System.out.println(resultSet.getString("FIRST_NAME"));
					}
					
				}
				
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		public void searchBooksByKeyword(String keyword){
				String query = "SELECT * FROM book";
				Connection conn = null;
				try{
					conn = getConnection();
					Statement st = conn.createStatement();
					ResultSet resultSet = st.executeQuery(query);
					
					while(resultSet.next()){
						if(resultSet.getString("BOOK_TITLE").contains(keyword)){
							System.out.println(resultSet.getString("BOOK_TITLE"));
						}
						
					}
					
				} catch(SQLException e){
					e.printStackTrace();
				}
			
		}

		//TODO: add implementation p32
		public List<Category>  findAllCategories(){
			List<Category> categoryList = new ArrayList<>();
			return categoryList;
		}
		
		
		@Override
		public void insert(Book book) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void update(Book book) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(Long bookId) {
			// TODO Auto-generated method stub
			
		}
}
