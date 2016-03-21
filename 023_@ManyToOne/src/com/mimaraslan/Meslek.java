package com.mimaraslan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="meslektablosu")
public class Meslek {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int meslekId;
	private String meslekAdi;
	//---------------------------
	@ManyToOne //M-1 COKTAN BIRE BAGLANTI
	private Personel personel;
	//---------------------------
	public Personel getPersonel() {
		return personel;
	}
	public void setPersonel(Personel personel) {
		this.personel = personel;
	}
	//---------------------------
	
	
	public int getMeslekId() {
		return meslekId;
	}
	public void setMeslekId(int meslekId) {
		this.meslekId = meslekId;
	}
	public String getMeslekAdi() {
		return meslekAdi;
	}
	public void setMeslekAdi(String meslekAdi) {
		this.meslekAdi = meslekAdi;
	}
	
	

}
