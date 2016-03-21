package com.mimaraslan.magaza;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class Main { 
	public static void main(String[] args)
	{		
		Configuration cfg = new Configuration();
	  //cfg.configure("hibernate.cfg.xml");                        
		cfg.configure("hibernate-mysql.cfg.xml");                                           
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
				
/*Bütün kayýtlarý çekiyoruz*/		
//Query query = session.createQuery("from Urun");	
  Query query = session.createQuery("FROM Urun");                                    

		List<?> l =query.list();
		System.out.println("Kayýt sayýsý : "+l.size());		
		Iterator<?> it = l.iterator();
		
		while(it.hasNext())
		{
			Object o = (Object)it.next();
			Urun u = (Urun)o;
			System.out.println("Ürün id : "+u.getUrunId());
			System.out.println("Ürün Adý : "+u.getUrunAdi());
			System.out.println("Ürün Fiyatý : "+u.getUrunFiyati());
			System.out.println("----------------------");
		}		
		
		session.close();
		factory.close();
	}
}




