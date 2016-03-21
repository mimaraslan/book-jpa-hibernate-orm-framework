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

//String hql = "FROM Urun U WHERE U.id < 8 ORDER BY U.urunAdi DESC";   
		
//String hql = "FROM Urun U WHERE U.urunId < 8 ORDER BY U.urunFiyati DESC";   
		
//String hql = "FROM Urun U WHERE U.urunId < :parametre ORDER BY U.urunFiyati DESC";                                           
		
//String hql = "FROM Urun U WHERE U.urunId < ? ORDER BY U.urunFiyati DESC";                                                    

String hql = "FROM Urun U " + 
			 "WHERE U.urunId < ? " + 
			 "ORDER BY U.urunFiyati DESC"; 

		Query query = session.createQuery(hql); 
		
	  //query.setParameter("parametre",8);   
		
		query.setParameter(0,8);       
		
		List<?> list = query.list();
		System.out.println("Kayýt sayýsý : " + list.size());
		Iterator<?> iterator = list.iterator();

		while(iterator.hasNext())
		{
			Object o = (Object)iterator.next();
			Urun urun = (Urun)o;
			System.out.println("Ürün id : "+urun.getUrunId());
			System.out.println("Ürün Adý : "+urun.getUrunAdi());
			System.out.println("Ürün Fiyatý : "+urun.getUrunFiyati());
			System.out.println("----------------------");
		}			
		session.close();
		factory.close();
	}
}

