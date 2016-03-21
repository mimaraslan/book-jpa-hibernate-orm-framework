package com.mimaraslan.magaza;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class Main { 
	public static void main(String[] args)
	{		
		Configuration cfg = new Configuration();                     
		cfg.configure("hibernate.cfg.xml");                                           
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();						
		
//Query query = session.createQuery("select U.urunId, U.urunAdi from Urun U");  
//Query query = session.createQuery("select u.urunId, u.urunAdi from Urun u"); 
		
//Query query = session.createQuery("SELECT U.urunId, U.urunAdi from Urun U");  
Query query = session.createQuery("SELECT u.urunId, u.urunAdi from Urun u"); 
		
			List<?> list =query.list();
			System.out.println("Kayýt sayýsý : "+list.size());		
			Iterator<?> iterator = list.iterator();
						
			while(iterator.hasNext())
			{
				Object o[] = (Object[])iterator.next();
							
				System.out.println("Ürün id : "+o[0]+ " - Ürün Adý : "+o[1]);
							
				System.out.println("----------------");
			}	

		session.close();
		factory.close();
	}
}







