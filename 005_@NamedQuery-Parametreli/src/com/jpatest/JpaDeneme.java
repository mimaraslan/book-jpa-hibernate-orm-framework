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
		ogrenci.setNo("622");
		ogrenci.setAdi("Aysel");
		ogrenci.setSoyadi("Seyitoðlu");
		ogrenci.setFakulte("Mühendislik");
		ogrenci.setBolum("Bilgisayar");
		//---------------------------------------------
		Ogrenci ogrenci2 = new Ogrenci("1040", "Betül", "Halýcý", "Mühendislik", "Yazýlým");
		
		Ogrenci ogrenci3 = new Ogrenci("751", "Ramazan", "Cesur", "Mühendislik", "Bilgisayar");
		

		emf = Persistence.createEntityManagerFactory("PU_AyarDosyasi"); //persistence-unit adi
		em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		try {
			et.begin();
			   em.persist(ogrenci);
			   
			   kayitEkle(em, "1699", "Alican", "Akkuþ", "Mühendislik", "Bilgisayar");
			   
			   em.persist(ogrenci2);
			   em.persist(ogrenci3);
			   
			   kayitEkle(em, "1071", "Sanem", "Erbil", "TIP", "Hekim");
			   
			   
			et.commit();
			
		} catch (Exception e) {
			et.rollback();
		}finally {
			
			if(em != null){
				
				kayitlariYazHepsi(em);
				kayitlariYazSecilen(em, 2);
				
				
				em.close();
				emf.close();
			}
		}
		
		
	
		
		
		
	}



	private static void kayitEkle(EntityManager em, String no,
			String adi, String soyadi, String fakulte, String bolum) {
	
		Ogrenci ogrenciNesnesi = new Ogrenci(no, adi, soyadi, fakulte, bolum);
		em.persist(ogrenciNesnesi);
		
	} 
	
	private static void kayitlariYazHepsi(EntityManager em) {
	
Query query = em.createNamedQuery("tumOgrenciKayitlariniGetir");
List<?> list = query.getResultList();
		
		for (Object obj : list) {
			Ogrenci ogrenci = (Ogrenci) obj;
			
			System.out.println("\nID : " + ogrenci.getId() +
					"\nADI SOYADI: " + ogrenci.getAdi() + " " + ogrenci.getSoyadi() +
					"\nFAKÜLTE : " + ogrenci.getFakulte() + 
					"\nBÖLÜMÜ : " + ogrenci.getBolum() 
					);
		}		
	}
	//--------------------------------------------------------
	
	private static void kayitlariYazSecilen(EntityManager em, int gelenDeger) {
		
Query query = em.createNamedQuery("secilenOgrenciKaydiniGetir").setParameter("p_id", gelenDeger);
List<?> list = query.getResultList();
		
		for (Object obj : list) {
			Ogrenci ogrenci = (Ogrenci) obj;
			
			System.out.println("\nID : " + ogrenci.getId() +
					"\nADI SOYADI: " + ogrenci.getAdi() + " " + ogrenci.getSoyadi() +
					"\nFAKÜLTE : " + ogrenci.getFakulte() + 
					"\nBÖLÜMÜ : " + ogrenci.getBolum() 
					);
		}			
	}
	//--------------------------------------------------------
}
