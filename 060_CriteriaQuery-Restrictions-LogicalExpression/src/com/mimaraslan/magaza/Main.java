package com.mimaraslan.magaza;

import java.util.List;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;               

public class Main {	
	public static void main(String[] args) {		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		@SuppressWarnings("deprecation")
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(Urun.class);

		Criterion fiyati = Restrictions.gt("urunFiyati", 10.0);              
		Criterion adi = Restrictions.ilike("urunAdi","K%");     

		//LogicalExpression orExp = Restrictions.or(fiyati, adi); 
		//criteria.add( orExp );     
		
		LogicalExpression andExp = Restrictions.and(fiyati, adi);                           
		criteria.add( andExp );                                                 

		@SuppressWarnings("unchecked")
	    List<Urun> urunlerListesi = criteria.list();

		for (Urun urun : urunlerListesi) {
		 System.out.println(urun.getUrunId() 
				 + " " + urun.getUrunAdi()
				 + " ---> " + urun.getUrunFiyati());
		}

    }
}















