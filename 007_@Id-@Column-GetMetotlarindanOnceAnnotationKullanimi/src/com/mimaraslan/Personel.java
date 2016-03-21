package com.mimaraslan;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "PERSONEL_TABLOSU") //VERITABANI TABLO ADI
public class Personel implements Serializable {
	
	
	private int personelId;
	private String personelAdi;
	private String personelSoyadi;
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name="ID") //TABLODAKI KOLON ADI
	public int getPersonelId() {
		return personelId;
	}
	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}
	
	@Column (name="ADI")
	public String getPersonelAdi() {
		return personelAdi;
	}
	public void setPersonelAdi(String personelAdi) {
		this.personelAdi = personelAdi;
	}
	
	@Column (name="SOYADI")
	public String getPersonelSoyadi() {
		return personelSoyadi;
	}
	public void setPersonelSoyadi(String personelSoyadi) {
		this.personelSoyadi = personelSoyadi;
	}
	

}
