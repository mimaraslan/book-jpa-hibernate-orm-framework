package com.hibernatetest;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mimaraslan.Adres;
import com.mimaraslan.Personel;

public class HibernateDeneme {

	public static void main(String[] args) {
		
		Personel personel = new Personel();
		personel.setPersonelAdi("Yunus");
		personel.setPersonelSoyadi("Savaþ");
		personel.setPersonelKayitTarihi(new Date());
		//---------------------------------------------
		Adres adres1 =  new Adres();
		adres1.setSehir("Ankara");
		adres1.setSemt("Gölbaþý");
		adres1.setCadde("cadde14");
		adres1.setKapiNo("kapiNo153");
		adres1.setPostaKodu("postaKodu632");
		
		personel.getAdresListesi().add(adres1);
		
		
		Adres adres2 =  new Adres();
		adres2.setSehir("Ankara");
		adres2.setSemt("Keçiören");
		adres2.setCadde("cadde571");
		adres2.setKapiNo("kapiNo1071");
		adres2.setPostaKodu("postaKodu1517");
		
		personel.getAdresListesi().add(adres2);
		
		
		
		
		
		
		Personel personel2 = new Personel();
		personel2.setPersonelAdi("Serhat");
		personel2.setPersonelSoyadi("Koçak");
		personel2.setPersonelKayitTarihi(new Date());
		//---------------------------------------------
		Adres adres3 =  new Adres();
		adres3.setSehir("Ýstanbul");
		adres3.setSemt("Kadýköy");
		adres3.setCadde("cadde12");
		adres3.setKapiNo("kapiNo99");
		adres3.setPostaKodu("postaKodu628");
		
		personel2.getAdresListesi().add(adres3);
		
		
		Adres adres4 =  new Adres();
		adres4.setSehir("Ýstanbul");
		adres4.setSemt("Fatih");
		adres4.setCadde("cadde1040");
		adres4.setKapiNo("kapiNo1326");
		adres4.setPostaKodu("postaKodu1516");
		
		personel2.getAdresListesi().add(adres4);
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
			session.save(personel);
			session.save(personel2);
		session.getTransaction().commit();
		

		
		

	}

}
