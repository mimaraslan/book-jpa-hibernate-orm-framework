package com.mimaraslan.kurum;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONEL")
public class Personel implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "PERSONEL_ID")
	private long personelId;
	
	@Column(name = "PERSONEL_ADI", nullable = false, length = 100)
	private String personelAdi;
	
	@Embedded
	private Adres personelAdres;
	//-------------------------------------
	public Personel() {
	}

	public Personel(String personelAdi) {
		this.personelAdi = personelAdi;
	}

	public Personel(String personelAdi, Adres personelAdres) {
		this.personelAdi = personelAdi;
		this.personelAdres = personelAdres;
	}
	//-------------------------------------
	public long getPersonelId() {
		return personelId;
	}
	public void setPersonelId(long personelId) {
		this.personelId = personelId;
	}

	public String getPersonelAdi() {
		return personelAdi;
	}
	public void setPersonelAdi(String personelAdi) {
		this.personelAdi = personelAdi;
	}

	public Adres getPersonelAdres() {
		return personelAdres;
	}
	public void setPersonelAdres(Adres personelAdres) {
		this.personelAdres = personelAdres;
	}
	
}







