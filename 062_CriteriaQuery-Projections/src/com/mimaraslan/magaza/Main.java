package com.mimaraslan.magaza;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.Projections;

public class Main {
	public static void main(String[] args) {		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		@SuppressWarnings("deprecation")
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
	
		 Criteria criteria1 = session.createCriteria(Urun.class)
				 .setProjection(Projections.max("urunFiyati"));
		 Double maxDeger = (Double) criteria1.uniqueResult();
		 System.out.println("En pahalý = " + maxDeger +"\n");

		 Criteria criteria2 = session.createCriteria(Urun.class)  
				 .setProjection(Projections.min("urunFiyati"));
		 Double minDeger = (Double) criteria2.uniqueResult();
		 System.out.println("En ucuz = " + minDeger +"\n");
		 
		 Criteria criteria3 = session.createCriteria(Urun.class);  
		 criteria3.setProjection(Projections.avg("urunFiyati"));
		 Double avgDeger = (Double) criteria3.uniqueResult();
		 System.out.println("Ortalama = " + avgDeger +"\n");
		 
		 Criteria criteria4 = session.createCriteria(Urun.class);  
		 criteria4.setProjection(Projections.sum("urunFiyati"));
		 Double toplamDeger = (Double) criteria4.uniqueResult();
		 System.out.println("Toplam = " + toplamDeger +"\n");
		 
    }
}
