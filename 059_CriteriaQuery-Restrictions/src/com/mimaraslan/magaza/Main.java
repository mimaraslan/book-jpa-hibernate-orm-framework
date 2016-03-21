package com.mimaraslan.magaza;

import java.util.List;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.Restrictions;               

public class Main {	
	public static void main(String[] args) {		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		@SuppressWarnings("deprecation")
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

  
		//Criteria criteria = session.createCriteria(Urun.class)
		//.add(Restrictions.eq("urunFiyati", 22.0));                          
		//  =   EQ	Equal         Eþittir                     
		
		//Criteria criteria = session.createCriteria(Urun.class)
		//.add(Restrictions.ne("urunFiyati", 22.0));                                     
		// <>   NE	Not Equal     Eþit deðil
		
		//Criteria criteria = session.createCriteria(Urun.class)		
		//.add(Restrictions.lt("urunFiyati", 22.0));                       
		// <    LT	Lower Than    Küçük eþit	
		
		//Criteria criteria = session.createCriteria(Urun.class)	 
		//.add(Restrictions.gt("urunFiyati", 22.0));                                                            
		// >    GT	Greater Than  Büyüktür
		
		//Criteria criteria = session.createCriteria(Urun.class)
		//.add(Restrictions.le("urunFiyati", 22.0));   
		// <=  LE	Lower Equal   Küçük eþit
		
		//Criteria criteria = session.createCriteria(Urun.class)
		//.add(Restrictions.ge("urunFiyati", 22.0));                                  
		// >=  GE	Greater Equal Büyük eþit
		
		//Criteria criteria = session.createCriteria(Urun.class)
		//.add(Restrictions.like("urunAdi", "K%"));                                                                       
		//Ýlk harfi K olan ürün isimleri
		

		@SuppressWarnings("unchecked")
		List<Urun> urunlerListesi = session.createCriteria(Urun.class) 
				 .add( Restrictions.like("urunAdi", "K%") ) 
				 .add( Restrictions.between("urunFiyati", 14.0, 35.0) ) 
				 .list(); 
		
		//List<Urun> urunlerListesi = criteria.list();

		for (Urun urun : urunlerListesi) {
		 System.out.println(urun.getUrunId() 
				 + " " + urun.getUrunAdi()
				 + " ---> " + urun.getUrunFiyati());
		}

    }
}















