package com.mimaraslan;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity 
@Table(name = "CALISANLAR") //TABLO ADI
public class Personel implements Serializable {
	
	@Id
	private int personelId;
	

	private String personelAdi;
	
	@Transient //BU ALANI GORMEZDEN GEL
	private String personelSoyadi;
	
	@Basic //BU ALAN TABLODA MUTLAKA BULUNACAK
	private Date personelKayitTarihi;
	private String personelAdresi;
	
	private static final long serialVersionUID = 1L;
	
	
	public int getPersonelId() {
		return personelId;
	}
	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}
	
	//-----------------------------------------	
	
	public String getPersonelAdi() {
		return personelAdi;
	}
	public void setPersonelAdi(String personelAdi) {
		this.personelAdi = personelAdi;
	}
	
	//-----------------------------------------	

	public String getPersonelSoyadi() {
		return personelSoyadi;
	}
	public void setPersonelSoyadi(String personelSoyadi) {
		this.personelSoyadi = personelSoyadi;
	}
	
	//-----------------------------------------	
	
	public String getPersonelAdresi() {
		return personelAdresi;
	}
	public void setPersonelAdresi(String personelAdresi) {
		this.personelAdresi = personelAdresi;
	}
	
	//-----------------------------------------	
	
	public Date getPersonelKayitTarihi() {
		return personelKayitTarihi;
	}
	public void setPersonelKayitTarihi(Date personelKayitTarihi) {
		this.personelKayitTarihi = personelKayitTarihi;
	}
	

}
