package com.mimaraslan.magaza;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Main {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		@SuppressWarnings("deprecation")
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		try {
			Transaction transaction = session.beginTransaction();
		//-----------------------------------			
			/*
			String hql = "DELETE FROM Urun u WHERE u.id = :urun_id";   		
			Query query = session.createQuery(hql);  

			query.setParameter("urun_id", 4);   
			*/
		//-----------------------------------				
			String hql = "DELETE FROM Urun u WHERE u.urunId = ?"; 
			Query query = session.createQuery(hql);  

			query.setParameter(0, 4); 			
		//-----------------------------------
			int result = query.executeUpdate();  
			transaction.commit();
			System.out.println("Silinen kayýt sayýsý : "+result
								+"\n*******************");
			session.flush();						
		//-----------------------------------							
			} catch (HibernateException e) {

			e.printStackTrace();
			} finally {
			session.close();
			} 
	}
}










