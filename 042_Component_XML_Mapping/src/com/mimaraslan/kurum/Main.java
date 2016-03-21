package com.mimaraslan.kurum;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mimaraslan.util.*;

public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Adres adres = new Adres("Mehmet Ünal Caddesi", 
									"Burdur", "Merkez", "12991453");
			Personel personel = new Personel("Ali Uyduelan", adres);
			session.save(personel);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}

