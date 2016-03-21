package com.mimaraslan.kurum;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONEL")
public class Personel implements Serializable {

	private static final long serialVersionUID = 1L;
	private long personelId;
	private String personelAdi;
	private Set<Telefon> personelTelefonNolari = new HashSet<Telefon>(0);
	//----------------------------------------------
	public Personel() {
	}

	public Personel(String personelAdi) {
		this.personelAdi = personelAdi;
	}

	public Personel(String personelAdi, Set<Telefon> personelTelefonNolari) {
		this.personelAdi = personelAdi;
		this.setPersonelTelefonNolari(personelTelefonNolari);
	}
	//----------------------------------------------	
	@Id
	@GeneratedValue
	@Column(name = "PERSONEL_ID")
	public long getPersonelId() {
		return personelId;
	}
	public void setPersonelId(long personelId) {
		this.personelId = personelId;
	}

	@Column(name = "PERSONEL_ADI", nullable = false, length = 100)
	public String getPersonelAdi() {
		return personelAdi;
	}

	public void setPersonelAdi(String personelAdi) {
		this.personelAdi = personelAdi;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "PERSONEL_TELEFON", 
		joinColumns = { @JoinColumn(name = "PERSONEL_ID") }, 
		inverseJoinColumns = { @JoinColumn(name = "TELEFON_ID") })
	public Set<Telefon> getPersonelTelefonNolari() {
		return personelTelefonNolari;
	}

	public void setPersonelTelefonNolari(Set<Telefon> personelTelefonNolari) {
		this.personelTelefonNolari = personelTelefonNolari;
	}

}




