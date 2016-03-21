package com.mimaraslan;

public class Personel implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private long personelId;
	private String personelAdi;
	//------------------------------------
	public Personel() {
	}

	public Personel(String personelAdi) {
		this.personelAdi = personelAdi;
	}
	//------------------------------------
	public long getPersonelId() {
		return this.personelId;
	}
	public void setPersonelId(long personelId) {
		this.personelId = personelId;
	}

	public String getPersonelAdi() {
		return this.personelAdi;
	}
	public void setPersonelAdi(String personelAdi) {
		this.personelAdi = personelAdi;
	}

}

