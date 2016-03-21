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
		personel.setPersonelAdi("Fetullah");
		personel.setPersonelSoyadi("Kaya");
		personel.setPersonelKayitTarihi(new Date());
		personel.setPersonelAdresi("Bakü - Azerbaycan");
		personel.setPersonelMaasi("5400");
		personel.setPersonelTelefonu("123456789");
		//---------------------------------------------

		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
			session.save(personel);
		session.getTransaction().commit();
		

		//---------------------------------------------
		personel = null;
	
		session.beginTransaction();
		
		personel = (Personel) session.get(Personel.class, 1);
		System.out.println("ID : " + personel.getPersonelId());
		System.out.println("ADI SOYADI : " + personel.getPersonelAdi() + " " + personel.getPersonelSoyadi());
		System.out.println("KAYIT TARÝHÝ  : " + personel.getPersonelKayitTarihi());
		System.out.println("ADRESÝ  : " + personel.getPersonelAdresi());
		System.out.println("MAAÞI  : " + personel.getPersonelMaasi());
		System.out.println("TELEFONU  : " + personel.getPersonelTelefonu());
		
		session.getTransaction().commit();
		
		session.close();
		
		

	}

}
