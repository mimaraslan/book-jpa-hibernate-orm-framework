package com.hibernatetest;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mimaraslan.Personel;

public class HibernateDeneme {

	public static void main(String[] args) {
		
		Personel personel = new Personel();
		personel.setPersonelAdi("Aytaç");
		personel.setPersonelSoyadi("Cici");
		personel.setPersonelKayitTarihi(new Date());
		//---------------------------------------------
		Adres adres =  new Adres();
		adres.setSehir("Kocaeli");
		adres.setSemt("semt1");
		adres.setMahalle("mahalle1");
		adres.setCadde("cadde1");
		adres.setDaireNo("daireNo1");
		adres.setKapiNo("kapiNo1");
		adres.setKat("kat1");
		adres.setPostaKodu("postaKodu1");
		
		personel.setAdres(adres);
		
		
		
		
		
		Personel personel2 = new Personel();
		personel2.setPersonelAdi("Murat");
		personel2.setPersonelSoyadi("Demir");
		personel2.setPersonelKayitTarihi(new Date());
		//---------------------------------------------
		Adres adres2 =  new Adres();
		adres2.setSehir("Aydýn");
		adres2.setSemt("semt2");
		adres2.setMahalle("mahalle2");
		adres2.setCadde("cadde2");
		adres2.setDaireNo("daireNo2");
		adres2.setKapiNo("kapiNo2");
		adres2.setKat("kat2");
		adres2.setPostaKodu("postaKodu2");
		
		personel2.setAdres(adres2);
		
		
		
		
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
		
		System.out.println("ÞEHÝR : " + personel.getAdres().getSehir());
		System.out.println("SEMT : " + personel.getAdres().getSemt());
		System.out.println("MAHALLE : " + personel.getAdres().getMahalle());
		System.out.println("CADDE : " + personel.getAdres().getCadde());
		System.out.println("DAÝRE : " + personel.getAdres().getDaireNo());
		System.out.println("KAPI NO : " + personel.getAdres().getKapiNo());
		System.out.println("KAT : " + personel.getAdres().getKat());
		System.out.println("POSTA KODU : " + personel.getAdres().getPostaKodu());
		//---------------------------------------------
		personel2 = (Personel) session.get(Personel.class, 2);
		System.out.println("ID : " + personel2.getPersonelId());
		System.out.println("ADI SOYADI : " + personel2.getPersonelAdi() + " " + personel2.getPersonelSoyadi());
		System.out.println("KAYIT TARÝHÝ  : " + personel2.getPersonelKayitTarihi());
		
		System.out.println("ÞEHÝR : " + personel2.getAdres().getSehir());
		System.out.println("SEMT : " + personel2.getAdres().getSemt());
		System.out.println("MAHALLE : " + personel2.getAdres().getMahalle());
		System.out.println("CADDE : " + personel2.getAdres().getCadde());
		System.out.println("DAÝRE : " + personel2.getAdres().getDaireNo());
		System.out.println("KAPI NO : " + personel2.getAdres().getKapiNo());
		System.out.println("KAT : " + personel2.getAdres().getKat());
		System.out.println("POSTA KODU : " + personel2.getAdres().getPostaKodu());

		session.getTransaction().commit();
		
		session.close();
		
		

	}

}
