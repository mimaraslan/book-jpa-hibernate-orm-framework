package com.mimaraslan.magaza;

import java.util.List;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Main {	
	public static void main(String[] args) {		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

   try {
	   Transaction transaction = session.beginTransaction();	
/*
			String hql = "FROM Urun";
			Query query = session.createQuery(hql);
			query.setFirstResult(2); //Bu kayýttan baþla
			query.setMaxResults(3); // Bu kadar kayýt getir
			
			List<Urun> urunler = (List<Urun>) query.list();
		transaction.commit();
	
			for (Urun u : urunler) {
				System.out.println(u.getUrunId()  + " " + 
						 		   u.getUrunAdi() + " " + 
						 		   u.getUrunFiyati());
			}
*/   
		String hql = "SELECT urunAdi FROM Urun";
		Query query = session.createQuery(hql);
		query.setFirstResult(2); //Bu kayýttan baþla
		query.setMaxResults(3); // Bu kadar kayýt getir
		
		List<String> urunler = (List<String>) query.list(); 
	transaction.commit();

		for (String u : urunler) { 
			System.out.println(u); 
		}	   
			} catch (HibernateException e) {
				e.printStackTrace();
			} finally {
				session.close();
			} 
	  }
}















