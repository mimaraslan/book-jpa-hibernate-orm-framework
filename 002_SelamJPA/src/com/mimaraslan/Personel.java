package com.mimaraslan;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import static javax.persistence.GenerationType.AUTO;

/**
 * Entity implementation class for Entity: Personel
 * 
 */ 
@Entity
public class Personel implements Serializable {
   
	@Id
	@GeneratedValue(strategy = AUTO)
	private int personelId;
	
	private String personelAdi;
	
	
	//@Column(name = "SOYADI")
	private String personelSoyadi;
	
	
	private static final long serialVersionUID = 1L;

	public Personel() {
		super();
	}   
	
	
	public int getPersonelId() {
		return this.personelId;
	}

	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}   
	public String getPersonelAdi() {
		return this.personelAdi;
	}

	public void setPersonelAdi(String personelAdi) {
		this.personelAdi = personelAdi;
	}   
	public String getPersonelSoyadi() {
		return this.personelSoyadi;
	}

	public void setPersonelSoyadi(String personelSoyadi) {
		this.personelSoyadi = personelSoyadi;
	}
   
}
