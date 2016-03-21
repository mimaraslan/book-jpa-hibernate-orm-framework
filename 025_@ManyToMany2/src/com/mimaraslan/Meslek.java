package com.mimaraslan;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="meslek")
public class Meslek {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int meslekId;
	private String meslekAdi;
	//---------------------------
	 // M-M COKTAN COGA BAGLANTI
	//@ManyToMany (mappedBy = "meslekListe") //TEK YONLU ERISIM
	@ManyToMany  //CIFT YONLU ERISIM
	private Collection<Personel> personelListe = new ArrayList<Personel>();
	//---------------------------

	public Collection<Personel> getPersonelListe() {
		return personelListe;
	}
	public void setPersonelListe(Collection<Personel> personelListe) {
		this.personelListe = personelListe;
	}
	
	
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
