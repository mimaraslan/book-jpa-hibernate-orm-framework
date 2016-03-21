package com.mimaraslan;

import java.util.List;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mimaraslan.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
			
		Main obj = new Main();
		Long personelId1 = obj.personelKaydet("Halil Ýbrahim Zengin");
		Long personelId2 = obj.personelKaydet("Hasan Yasin Türkyýlmaz");
		Long personelId3 = obj.personelKaydet("Vuqar Suleymanov");
		Long personelId4 = obj.personelKaydet("Berivan Koç");
		Long personelId5 = obj.personelKaydet("Ýbrahim Tütüncü");
		Long personelId6 = obj.personelKaydet("Barýþ Gün");
		obj.personelListe();
		
		obj.personelGuncelle(personelId3, "Mehmet Bayar");
		obj.personelSil(personelId2);
		obj.personelSil(personelId6);
		obj.personelGuncelle(personelId5, "Volkan Korkmaz");
		obj.personelSil(personelId4);
		obj.personelListe();
		
		obj.personelGuncelle(personelId1, "Tebriz Abdullazadeh");
		obj.personelListe();
	}
	//------------------------------------
	public Long personelKaydet(String personelAdi)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		Long personelId = null;
		try {
			transaction = session.beginTransaction();
			Personel personel = new Personel();
			personel.setPersonelAdi(personelAdi);
			personelId = (Long) session.save(personel);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return personelId;
	}
	//------------------------------------
	public void personelListe()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			List<?> personels = session.createQuery("FROM PERSONEL").list();
			for (Iterator<?> iterator = personels.iterator(); iterator.hasNext();)
			{
				Personel personel = (Personel) iterator.next();
				System.out.println(personel.getPersonelAdi());
			}
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	//------------------------------------
	public void personelGuncelle(Long personelId, String personelAdi)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Personel personel = (Personel) session.get(Personel.class, personelId);
			personel.setPersonelAdi(personelAdi);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	//------------------------------------	
	public void personelSil(Long personelId)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Personel personel = (Personel) session.get(Personel.class, personelId);
			session.delete(personel);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
