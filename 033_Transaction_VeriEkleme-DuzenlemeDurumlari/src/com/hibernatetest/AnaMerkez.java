package com.hibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mimaraslan.Personel;

public class AnaMerkez {
	public static void main(String[] args) {	
			
	Personel personel = new Personel();	 
		
		personel.setPersonelAdi("Dilek");
		personel.setPersonelSoyadi("Özlü");
		
SessionFactory sessionFactory 
= new Configuration().configure().buildSessionFactory();
Session session = sessionFactory.openSession();
//-----------------------------------------------
	session.beginTransaction(); 	
		personel.setPersonelAdi("Kübra");   
		personel.setPersonelSoyadi("Kendirli");  
		session.save(personel);               
	session.getTransaction().commit();
	session.close();	
	
	System.out.println("Ekleme sonrasý : " + 
						personel.getPersonelAdi() +" "+ 
						personel.getPersonelSoyadi() );		
//-----------------------------------------------
	session = sessionFactory.openSession();     
	session.beginTransaction();                               
		personel.setPersonelAdi("Zehra");   
		personel.setPersonelSoyadi("Kýraç");  
		session.update(personel);											
	session.getTransaction().commit();
	session.close();	

	System.out.println("Günceleme sonrasý : " + 
						personel.getPersonelAdi() +" "+ 
						personel.getPersonelSoyadi() );	
	}
}


















