package com.mimaraslan;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)

@DiscriminatorColumn(
		name = "MESLEK_TIPI", 
		discriminatorType = DiscriminatorType.STRING
		)
@Table(name="MESLEKTABLOSU")
public class Meslek {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int meslekId;
	private String meslekAdi;
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
