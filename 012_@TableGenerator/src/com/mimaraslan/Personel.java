package com.mimaraslan;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity 
@Table(name = "CALISANLAR") //TABLO ADI
public class Personel implements Serializable {
	
	@Id
	@TableGenerator(name = "ektablo", table ="tblpersonel", 
	pkColumnName ="maasi", pkColumnValue ="6000",
	allocationSize=1)//ID DEÐERÝNÝ EK TABLODA SAKLAR
	@GeneratedValue(strategy = GenerationType.TABLE, generator="ektablo") //ID ALANINA OTOMATIK ID DEGERLER VERILIYOR
	private int personelId;
	private String personelAdi;
	private String personelSoyadi;
	
	@Temporal (TemporalType.DATE)
	private Date personelKayitTarihi;
	
	@Lob
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
