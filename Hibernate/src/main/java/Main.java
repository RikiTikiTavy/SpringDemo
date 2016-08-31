import org.hibernate.SessionFactory;

public class Main {
			
	public static void main(String[] args){
		BasicMovieManager man = new BasicMovieManager();
		SessionFactory sessionFactory = man.getSession();
		System.out.println("Done");
	}
}
