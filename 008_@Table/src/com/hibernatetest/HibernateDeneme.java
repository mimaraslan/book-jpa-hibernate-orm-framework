package com.hibernatetest;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mimaraslan.Personel;

public class HibernateDeneme {

	public static void main(String[] args) {
		
		Personel personel = new Personel();
		personel.setPersonelId(1);
		personel.setPersonelAdi("Mimar");
		personel.setPersonelSoyadi("Aslan");
		personel.setPersonelKayitTarihi(new Date());
		personel.setPersonelAdresi("Ukrayna Donetsk");
		//---------------------------------------------
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		//	SessionFactory sessionFactory = new AnnotationConfiguration().configure().addPackage("com.mimaraslan").addAnnotatedClass(com.mimaraslan.Personel.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
			session.save(personel);
		session.getTransaction().commit();
		
		session.close();
		

	}

}
