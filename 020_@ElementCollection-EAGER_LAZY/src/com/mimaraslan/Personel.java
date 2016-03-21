package com.mimaraslan;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


@Entity 
@Table(name = "personeltablosu") //TABLO ÖZELLÝKLERÝ
public class Personel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //ID ALANINA OTOMATIK ID DEGERLER VERILIYOR
	private int personelId;
	private String personelAdi;
	private String personelSoyadi;
	private Date personelKayitTarihi;
	//private String personelAdresi;
	
	//---------------------------------------
	@Embedded //BU ALANA BAÞKA BÝR SINIFTAKÝ BÝLGÝLER GÖMÜLECEK - GELECEK
	@ElementCollection(fetch = FetchType.LAZY ) //EAGER - VARSAYILANDIR - BUTUN ILISKILI KAYITLAR - TOPLU YUKLEME  
												 //LAZY -  SADECE SECTIGIMIZ TALODAN ILGILI KAYITLAR - TEMBEL YUKLEME
	@JoinTable(name="adreslistesitablosu", //KALITIM TABLOSU
	joinColumns = @JoinColumn(name="PERSONEL_ID")
	//COCUK ALT DETAY TABLODAKI ID KOLONUN ADINI DEGISTIRIR - KALITIM SUTUNU
	)
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@CollectionId(
			columns = { @Column(name="ADRES_ID") }, 
			generator = "hilo-gen", 
			type = @Type(type="long"))
	private Collection<Adres> adresListesi = new ArrayList<Adres>();
	//---------------------------------------
	

	public Collection<Adres> getAdresListesi() {
		return adresListesi;
	}

	public void setAdresListesi(Collection<Adres> adresListesi) {
		this.adresListesi = adresListesi;
	}

	
//---------------------------------------	
		

	
	

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
	/*
	public String getPersonelAdresi() {
		return personelAdresi;
	}
	public void setPersonelAdresi(String personelAdresi) {
		this.personelAdresi = personelAdresi;
	}
	*/
	//-----------------------------------------	
	
	public Date getPersonelKayitTarihi() {
		return personelKayitTarihi;
	}
	public void setPersonelKayitTarihi(Date personelKayitTarihi) {
		this.personelKayitTarihi = personelKayitTarihi;
	}
	
	

}
