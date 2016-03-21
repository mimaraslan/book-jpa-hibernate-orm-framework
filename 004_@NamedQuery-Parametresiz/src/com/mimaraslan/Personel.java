package com.mimaraslan;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Personel database table.
 * 
 */
@Entity
@NamedQuery(name="Personel.findAll", query="SELECT p FROM Personel p")
public class Personel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int personelId;

	private String personelAdi;

	private String personelSoyadi;

	public Personel() {
	}

	public int getPersonelId() {
		return this.personelId;
	}

	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}

	public String getPersonelAdi() {
		return this.personelAdi;
	}

	public void setPersonelAdi(String personelAdi) {
		this.personelAdi = personelAdi;
	}

	public String getPersonelSoyadi() {
		return this.personelSoyadi;
	}

	public void setPersonelSoyadi(String personelSoyadi) {
		this.personelSoyadi = personelSoyadi;
	}

}