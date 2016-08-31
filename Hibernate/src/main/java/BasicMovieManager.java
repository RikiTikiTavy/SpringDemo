import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class BasicMovieManager {
	
	private SessionFactory sessionFactory = null;
	
	private void initSessionFactory(){
		Configuration config = new Configuration().configure();
		
		StandardServiceRegistryBuilder serviceRegistry = new StandardServiceRegistryBuilder().
				applySettings(config.getProperties());
				
		
		sessionFactory = config.buildSessionFactory(serviceRegistry.build());
	}
	
	public SessionFactory getSession(){
		return sessionFactory;
	}
}
