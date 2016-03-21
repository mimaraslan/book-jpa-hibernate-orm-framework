package com.mimaraslan.kurum;

import com.mimaraslan.util.HibernateUtil;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			
			Set<Telefon> telefonNolari = new HashSet<Telefon>();
			telefonNolari.add(new Telefon("Ev", "571632622628"));
			telefonNolari.add(new Telefon("Cep","145312991517"));
			
		Personel personel = new Personel("Emrehan Sakin", telefonNolari);
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

