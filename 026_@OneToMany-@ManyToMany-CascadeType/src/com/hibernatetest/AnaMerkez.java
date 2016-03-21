package com.hibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mimaraslan.Meslek;
import com.mimaraslan.Personel;

public class AnaMerkez {

	public static void main(String[] args) {
		
		Personel personel = new Personel();
		personel.setPersonelAdi("Orhan");
		personel.setPersonelSoyadi("Eripek");
		//---------------------------------------------
		Meslek meslek = new Meslek();
		meslek.setMeslekAdi("Mühendis");
	
		Meslek meslek2 = new Meslek();
		meslek2.setMeslekAdi("Yazar");
		
		Meslek meslek3 = new Meslek();
		meslek3.setMeslekAdi("Konuþmacý");
		
		//---------------------------------------------
		personel.getMeslekListe().add(meslek);
		personel.getMeslekListe().add(meslek2);
		personel.getMeslekListe().add(meslek3);
		//---------------------------------------------
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.persist(personel);
			//session.save(personel);
			//session.save(meslek);
			//session.save(meslek2);
		session.getTransaction().commit();
		session.close();


	}

}
