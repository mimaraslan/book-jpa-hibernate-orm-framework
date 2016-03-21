package com.mimaraslan.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mimaraslan.map.Ogrenci;
import com.mimaraslan.map.OgrenciBilgisi;
import com.mimaraslan.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        
        try {      	
        	 transaction = session.beginTransaction();
          /*  
 	        Ogrenci ogrenci = new Ogrenci();
 	        ogrenci.setOgrenciAdi("Azimli");
 	        ogrenci.setOgrenciSoyadi("Javid");
 	      */  
 	        Ogrenci ogrenci = new Ogrenci("Azimli", "Javid");
	         	
 	        OgrenciBilgisi ogrenciBilgisi = new OgrenciBilgisi();  
 	        ogrenciBilgisi.setAdres("Bakü");
 	        ogrenciBilgisi.setKayitNo(("12991923"));
 	        ogrenciBilgisi.setTelefonNo("5716321453");
 	        ogrenciBilgisi.setEmail("azimli.javid@facebook.com");
 	        ogrenciBilgisi.setKayitTarihi((new Date()));
 	        
	 	   try {
	 			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
	 			Date date = format.parse("1990-01-02");
	 			ogrenciBilgisi.setDogumTarihi(date);
	 		  } catch (ParseException e) {
	 			e.printStackTrace();
	 		  }

 	        ogrenciBilgisi.setOgrenci(ogrenci);
 	        ogrenci.setOgrenciBilgisi(ogrenciBilgisi);
 	
 	        session.save(ogrenci); 
         
          //session.getTransaction().commit();
          transaction.commit();
         
          System.out.println("Baþarýlý olarak kaydedildi.");
			
		}catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			session.close();
		}
       
    }
}

 



