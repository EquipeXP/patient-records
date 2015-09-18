package com.unicamp.util;

import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.unicamp.entity.Patient;

public class HibernateUtil {
	
	private static final SessionFactory concreteSessionFactory;
	
	static {
		try {
			
			Properties prop= new Properties();
			
			prop.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/pep");
			prop.setProperty("hibernate.connection.username", "app");
			prop.setProperty("hibernate.connection.password", "");
			prop.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
			
			concreteSessionFactory = new Configuration()
					.addPackage("com.unicamp.entity")
					.addProperties(prop)
					.addAnnotatedClass(Patient.class)
					.buildSessionFactory();
			
		} catch (Throwable ex) {
			
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static Session getSession() throws HibernateException {
		
		return concreteSessionFactory.openSession();
	}
}
