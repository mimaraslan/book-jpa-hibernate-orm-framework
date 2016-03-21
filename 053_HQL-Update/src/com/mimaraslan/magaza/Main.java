package com.mimaraslan.magaza;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

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
			String hql = "UPDATE Urun u 
			SET u.urunFiyati = :urun_fiyati, u.urunAdi = :urun_adi   
			WHERE u.id = :urun_id";  
			
			Query query = session.createQuery(hql);  

			query.setParameter("urun_fiyati", 57.1);  
			query.setParameter("urun_adi", "Silgi");  
			query.setParameter("urun_id", 6);  
			*/
		//-----------------------------------				
			String hql = "UPDATE Urun u " +
					"SET u.urunFiyati = ?,  u.urunAdi = ?" +
					" WHERE u.urunId = ?";

			Query query = session.createQuery(hql);  

			query.setParameter(0, 57.1);  
			query.setParameter(1, "Silgi");  
			query.setParameter(2, 6);;
			
			

			int result = query.executeUpdate();  
			transaction.commit();
			System.out.println("Deðiþtirilen kayýt sayýsý : "+result
								+"\n*******************");
			session.flush();
						
			//-----------------------------------		
			hql = "FROM Urun";
			query = session.createQuery(hql); 
			
			List<?> list = query.list();
			System.out.println("Toplam kayýt sayýsý : " + list.size()); 
			Iterator<?> iterator = list.iterator();

			while (iterator.hasNext()) {
				Object o = (Object) iterator.next();
				Urun urun = (Urun) o;
				System.out.print("Id : " + urun.getUrunId());
				System.out.print("   Adý : " + urun.getUrunAdi());
				System.out.print("   Fiyatý : " + urun.getUrunFiyati());
				System.out.println("\n----------------------");
			}
	//-----------------------------------				
			
			} catch (HibernateException e) {

			e.printStackTrace();
			} finally {
			session.close();
			} 

	}
}










