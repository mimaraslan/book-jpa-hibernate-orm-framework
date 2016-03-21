package com.hibernatetest;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mimaraslan.Personel;

public class HibernateDeneme {

	public static void main(String[] args) {
		
		Personel personel = new Personel();
		//personel.setPersonelId(1);
		personel.setPersonelAdi("Mimar");
		personel.setPersonelSoyadi("Aslan");
		personel.setPersonelKayitTarihi(new Date());
		personel.setPersonelAdresi("Ukrayna Donetsk");
		//---------------------------------------------
		Personel personel2 = new Personel();
		//personel.setPersonelId(2);
		personel2.setPersonelAdi("Orhan");
		personel2.setPersonelSoyadi("Eripek");
		personel2.setPersonelKayitTarihi(new Date());
		personel2.setPersonelAdresi("Turkiye Istanbul");
		//---------------------------------------------
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
			session.save(personel);
			session.save(personel2);
		session.getTransaction().commit();
		

		//---------------------------------------------
		personel = null;
	
		session.beginTransaction();
		
		personel = (Personel) session.get(Personel.class, 1);
		System.out.println("ID : " + personel.getPersonelId());
		System.out.println("ADI SOYADI : " + personel.getPersonelAdi() + " " + personel.getPersonelSoyadi());
		System.out.println("KAYIT TARÝHÝ  : " + personel.getPersonelKayitTarihi());
		System.out.println("ADRESÝ  : " + personel.getPersonelAdresi());
		
		System.out.println("------------------------------------- "); 

		personel = (Personel) session.get(Personel.class, 2);
		System.out.println("ID : " + personel.getPersonelId());
		System.out.println("ADI SOYADI : " + personel.getPersonelAdi() + " " + personel.getPersonelSoyadi());
		System.out.println("KAYIT TARÝHÝ  : " + personel.getPersonelKayitTarihi());
		System.out.println("ADRESÝ  : " + personel.getPersonelAdresi());
		
		session.getTransaction().commit();
		
		session.close();
		
		

	}

}
