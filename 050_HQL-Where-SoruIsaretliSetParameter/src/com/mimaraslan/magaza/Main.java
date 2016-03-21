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

	  //String hql = "FROM Urun M WHERE M.id = 2";                                            
	  //String hql = "FROM Urun M WHERE M.id = :parametre";   
		String hql = "FROM Urun M WHERE M.id = ?";                                  
		Query query = session.createQuery(hql); 
		
		query.setParameter(0,1);                                             
		
		List<?> list = query.list();
		System.out.println("Kayýt sayýsý : " + list.size());
		Iterator<?> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println("---------------");
			Object o = (Object) iterator.next();
			Urun urun = (Urun) o;
			System.out.println("Ürün Adý    : " + urun.getUrunAdi());
			System.out.println("Ürün Fiyatý : " + urun.getUrunFiyati());
			System.out.println("---------------");
		}
		session.close();
		factory.close();
	}
}

