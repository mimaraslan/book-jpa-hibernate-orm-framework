package com.hibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mimaraslan.Meslek;
import com.mimaraslan.Sektor;
import com.mimaraslan.Tecrube;

public class Test {

	public static void main(String[] args) {
	
		Meslek meslek = new Meslek();
		meslek.setMeslekAdi("Serbest");
		//---------------------------------------------
		Sektor sektor = new Sektor();
		sektor.setMeslekAdi("Bilgisayar Mühendisi");
		sektor.setCalismaAlani("Java");		
		//---------------------------------------------
		Tecrube tecrube = new Tecrube();
		tecrube.setMeslekAdi("Proje Yöneticisi");
		tecrube.setDeneyimYili(5);
	
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
			session.save(meslek);
			session.save(sektor);
			session.save(tecrube);
		session.getTransaction().commit();
		session.close();


	}

}
