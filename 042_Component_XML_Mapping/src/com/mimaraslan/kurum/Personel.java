package com.mimaraslan.kurum;

public class Personel implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private long personelId;
	private String personelAdi;
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
