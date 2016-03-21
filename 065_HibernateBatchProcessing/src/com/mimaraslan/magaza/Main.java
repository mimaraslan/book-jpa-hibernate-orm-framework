package com.mimaraslan.magaza;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.Projections;

public class Main {
	public static void main(String[] args) {		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = cfg.buildSessionFactory();

/*//
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		for ( int i=0; i<100000; i++ ) {                               
		    Urun urun = new Urun();
		    session.save(urun);
		    
		    if ( i % 25 == 0 ) {   							
		        session.flush(); 
		        session.clear(); 
		    } 
		}
	
		tx.commit();
		session.close();
	*/	
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
								//SORGUYU BURADA KENDÝMÝZ YAZDIK
/*
  ScrollableResults urunCursor = session.createQuery("FROM URUN")
  .scroll(); 
*/ //SUNUCU TARAFINDAKÝ KAYITLARI GEZERKEN scroll KULLANIYORUZ

		
										  //SORGUYU ÝSÝMLE ALDIK
  ScrollableResults urunCursor = session.getNamedQuery("GetUrun") 
			    .setCacheMode(CacheMode.IGNORE)
			    .scroll(ScrollMode.FORWARD_ONLY);
 
			int sayac=0; //SAYAÇ
			
			while ( urunCursor.next() ) { //BÝR SONRAKÝ KAYIT
				Urun urun = (Urun) urunCursor.get(0);
				//urun.guncelleUrun(); //KENDÝ METODUMUZLA DA GÜNCELLEYENÝLÝRDÝK
				session.update(urun); //OTURUM NESNESÝ ÜZERÝNDEN GÜNCELLE
			    if ( ++sayac % 25 == 0 ) {  //SAYAÇI MOD 25'E GÖRE ÝÞLE
			        session.flush();  //TRANSACTION ARALARINDA 
			        				  //ÖNBELLKETEKÝ VERÝLERÝ KALICI HALE GETÝR.
			        session.clear();  
			        //ÖNBELLKEKTE ÞÝÞME OLMASIN DÝYE 
			        //ÝÞÝ BÝTEN NESNELERÝ YÖNETÝMLÝ OLMADAN ÇIKAR.
			    }
			}
			
			tx.commit();
			session.close();	
    }
}
