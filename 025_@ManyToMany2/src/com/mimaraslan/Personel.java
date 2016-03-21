package com.mimaraslan;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity 
@Table(name = "personel") //TABLO ÖZELLÝKLERÝ
public class Personel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //ID ALANINA OTOMATIK ID DEGERLER VERILIYOR
	private int personelId;
	private String personelAdi;
	private String personelSoyadi;
	

	//---------------------------------------
	@ManyToMany  // M-M COKTAN COGA BAGLANTI
/*	
	//IKI ENTITY ARASINDAKI KALITIM TABLOSUNUN ADI
	@JoinTable(name="PERSONEL_MESLEK",

	//ANA TABLOYA - HAKIM TARAFA AIT ID KOLON BILGISI
	joinColumns = @JoinColumn(name="PERSONEL_ID"),
	
	//COCUK TABLOYA - HAKIM OLMAYAN TARAFA AIT ID KOLON BILGISI
	inverseJoinColumns =  @JoinColumn(name="MESLEK_ID")		
			)
*/
	private Collection<Meslek> meslekListe = new ArrayList<Meslek>();
	//---------------------------------------	
		
	public Collection<Meslek> getMeslekListe() {
		return meslekListe;
	}

	public void setMeslekListe(Collection<Meslek> meslekListe) {
		this.meslekListe = meslekListe;
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
	

}
