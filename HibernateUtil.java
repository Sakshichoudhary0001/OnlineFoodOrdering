package sak.com.utility;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sak.com.model.User;
import sak.com.model.Menu;
import sak.com.model.Order;

public class HibernateUtil {
	private final static SessionFactory sessionFactory=buildSessionFactory();
	private static SessionFactory buildSessionFactory() {
		try {
			//create the SessionFactory from hibernate.cfg.xml
			return new Configuration().configure("hibernate.cfg.xml")
					
					.addAnnotatedClass(User.class)
					.addAnnotatedClass(Menu.class)
					.addAnnotatedClass(Order.class)
					.buildSessionFactory();
		} catch (Throwable ex) {
			//Make sure you log the exception, as it might be swallowed
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static Session getSession()
	{
		return getSessionFactory().openSession(); //session opened
	}
}