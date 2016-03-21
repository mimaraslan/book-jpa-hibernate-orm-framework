package com.mimaraslan.magaza;

import org.hibernate.*;
import org.hibernate.cfg.*;


public class Main extends EmptyInterceptor{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		@SuppressWarnings("deprecation")
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
	
		
		 
    }
}
