package com.mimaraslan.test;
 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mimaraslan.map.Departman;
import com.mimaraslan.map.Calisan;
import com.mimaraslan.util.HibernateUtil;
 
public class App {
    public static void main(String[] args) {

    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
         
        try {
			transaction = session.beginTransaction();
			
			  Departman departman = new Departman();
			  departman.setDepartmanAdi("Donaným");
		      session.save(departman);
		 		        
		      Calisan calisan1 = new Calisan("Mahmut Talha", "Ortaþ", "5711299");
		      Calisan calisan2 = new Calisan("Özmen", "Kilit",  "6321453");
		      Calisan calisan3 = new Calisan("Sercan", "Bozkurt", 
		    		  						 new Date(), "7511071");		        	        
		      Calisan calisan4 = null;
		       try {
		    	 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		 		 Date date = format.parse("1996-10-26");
		 		 calisan4  = new Calisan("Murat Necip", "Arcan", date, "6221040");
		 		 } catch (ParseException e) {
		 			e.printStackTrace();
		 		  }

		        calisan1.setDepartman(departman);
		        calisan2.setDepartman(departman);
		        calisan3.setDepartman(departman);
		        
		        session.save(calisan1);
		        session.save(calisan2);
		        session.save(calisan3);
		        
		        
		        Departman departman2 = new Departman();
		        departman2.setDepartmanAdi("Yazýlým");
		        session.save(departman2);
		        
		        calisan4.setDepartman(departman2);
		        calisan3.setDepartman(departman2);
				 
		        session.save(calisan4);
		        
		        transaction.commit();
		        
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

    }
}








