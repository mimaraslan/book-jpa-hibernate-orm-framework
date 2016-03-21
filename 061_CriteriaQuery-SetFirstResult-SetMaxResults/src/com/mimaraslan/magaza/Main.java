package com.mimaraslan.magaza;

import java.util.List;
import org.hibernate.*;
import org.hibernate.cfg.*;
              
public class Main {	
	public static void main(String[] args) {		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		@SuppressWarnings("deprecation")
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
   /*
		Criteria criteria = session.createCriteria(Urun.class);
		criteria.setFirstResult(2);
		criteria.setMaxResults(4);
	*/
		
		Criteria criteria = session.createCriteria(Urun.class)                              
				 .setFirstResult(2) 
				 .setMaxResults(4); 
		
		@SuppressWarnings("unchecked")
	    List<Urun> urunlerListesi = criteria.list();

		for (Urun urun : urunlerListesi) {
		 System.out.println(urun.getUrunId() 
				 + " " + urun.getUrunAdi()
				 + " ---> " + urun.getUrunFiyati());
		}

    }
}















