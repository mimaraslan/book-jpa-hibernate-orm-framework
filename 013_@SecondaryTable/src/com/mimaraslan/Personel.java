package com.mimaraslan;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;


@Entity 
@Table(name = "Personel") //TABLO ÖZELLÝKLERÝ
@SecondaryTable(name = "PersonelDetay") //ÝKÝNCÝ TABLOM
public class Personel implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //ID ALANINA OTOMATIK ID DEGERLER VERILIYOR
	private int personelId;
	private String personelAdi;
	private String personelSoyadi;
	
	@Column(table="PersonelDetay")
	private Date personelKayitTarihi;
	
	@Column(name="Adres", table="PersonelDetay")
	private String personelAdresi;
	
	@Column(name="Maas", table="PersonelDetay")
	private String personelMaasi;
	
	@Column(table="PersonelDetay")
	private String personelTelefonu;
	
	private static final long serialVersionUID = 1L;
	
	
	
	
	public String getPersonelMaasi() {
		return personelMaasi;
	}
	public void setPersonelMaasi(String personelMaasi) {
		this.personelMaasi = personelMaasi;
	}
	public String getPersonelTelefonu() {
		return personelTelefonu;
	}
	public void setPersonelTelefonu(String personelTelefonu) {
		this.personelTelefonu = personelTelefonu;
	}
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
