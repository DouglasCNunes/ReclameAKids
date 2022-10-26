package reclameakids.DAO.GenericoDAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateUtil {
	private static SessionFactory sessionfactory;
	
	
	private static SessionFactory getSessionFactory() throws HibernateException {
		Configuration configuration = new Configuration();
		configuration.configure();
		
		if(sessionfactory == null)
			sessionfactory = configuration.buildSessionFactory();
		return sessionfactory;
	}
	
	public static Session getSession() {
		return getSessionFactory().openSession();
	}
}
