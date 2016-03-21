package com.mimaraslan.magaza;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Main {
	public static void main(String[] args) {		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		//----------------------------------------------				
		Query query1 = session.createSQLQuery(
			"SELECT * FROM Urun u WHERE u.urunFiyati < ?")
			.addEntity(Urun.class)
			.setParameter(0, 22.0);
		//----------------------------------------------				
		Query query2 = session.createSQLQuery(
			"SELECT * FROM Urun u WHERE u.urunFiyati < :parametre")
			.addEntity(Urun.class)
			.setParameter("parametre", 22.0);
		//----------------------------------------------				
		String sql3 = "SELECT u.urunId, u.urunAdi, u.urunFiyati " +
				"FROM Urun u WHERE u.urunFiyati < :parametre";
		Query query3 = session.createSQLQuery(sql3);
		((SQLQuery) query3).addEntity(Urun.class);
		 query3.setParameter("parametre", 22.0);
		//----------------------------------------------				
		String sql4 = "SELECT u.urunId, u.urunAdi, u.urunFiyati " +
				"FROM Urun u WHERE u.urunFiyati < :parametre";
		Query query4 = session.createSQLQuery(sql4)
			.addEntity(Urun.class)
			.setParameter("parametre", 22.0);
		//----------------------------------------------					
		List<Urun> urunlerListesi = query4.list();

		for (Urun urun : urunlerListesi) {
		 System.out.println(urun.getUrunId() 
				 + " " + urun.getUrunAdi()
				 + " ---> " + urun.getUrunFiyati());
		}		 
    }
}
