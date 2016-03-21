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
			Adres adres = new Adres("Üniversite Caddesi", 
									"Erzurum", "Merkez", "251517");
			Personel personel = new Personel("Ezgi Fidan", adres);
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



