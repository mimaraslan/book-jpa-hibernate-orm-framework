package com.jpatest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mimaraslan.Ogrenci;

public class JpaDeneme {

	public static void main(String[] args) {
		EntityManagerFactory emf;
		EntityManager em;
		
		Ogrenci ogrenci = new Ogrenci();
		//ogrenci.setId(1);
		ogrenci.setAdi("Baran");
		ogrenci.setSoyadi("Feti");
		ogrenci.setBolum("Doktor");
		ogrenci.setFakulte("Kalp");
		ogrenci.setNo("12991071");
		//---------------------------------------------

		emf = Persistence.createEntityManagerFactory("PU_AyarDosyasi"); //persistence-unit adi
		em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
			em.persist(ogrenci);
		et.commit();
		
		
		
		Query query = em.createNamedQuery("tumOgrenciKayitlariniGetir");
		List<?> list = query.getResultList();
		
		for (Object obj : list) {
			ogrenci = (Ogrenci) obj;
			
			System.out.println("\nID : " + ogrenci.getId() +
					"\nADI SOYADI: " + ogrenci.getAdi() + " " + ogrenci.getSoyadi() +
					"\nFAKÜLTE : " + ogrenci.getFakulte() + 
					"\nBÖLÜMÜ : " + ogrenci.getBolum() 
					);
		}
		
		
		
		em.close();
		emf.close();
		
	}

}
