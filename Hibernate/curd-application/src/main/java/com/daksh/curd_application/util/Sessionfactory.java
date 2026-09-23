package com.daksh.curd_application.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Sessionfactory {
	static SessionFactory sessionFactory;
	static {
		try {
			sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}catch(Throwable ex) {
            throw new ExceptionInInitializerError(ex);
		}
	}
	public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
