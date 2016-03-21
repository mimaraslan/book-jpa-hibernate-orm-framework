package com.jpatest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mimaraslan.Ogrenci;

public class JpaDeneme {

	public static void main(String[] args) {
		EntityManagerFactory emf;
		EntityManager em;
		
		Ogrenci ogrenci = new Ogrenci();
		//ogrenci.setId(1);
		ogrenci.setAdi("Salih");
		ogrenci.setSoyadi("Aslan");
		ogrenci.setBolum("Hekim");
		ogrenci.setFakulte("TIP");
		ogrenci.setNo("1299571");
		//---------------------------------------------

		emf = Persistence.createEntityManagerFactory("PU_AyarDosyasi"); //persistence-unit adi
		em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
			em.persist(ogrenci);
		et.commit();
		
		
		System.out.println("\nID : " + ogrenci.getId() +
				"\nADI : " + ogrenci.getAdi() +
				"\nSOYADI : " + ogrenci.getSoyadi() 
				);
		
		em.close();
		emf.close();
		
	}

}
