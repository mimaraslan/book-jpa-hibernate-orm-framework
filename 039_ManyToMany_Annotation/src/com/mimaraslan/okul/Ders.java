package com.mimaraslan.okul;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DERS")
public class Ders implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="DERS_ID")
	private long dersId;
	
	@Column(name="DERS_ADI", nullable=false)
	private String dersAdi;
	//----------------------------------------
	public Ders() {
	}

	public Ders(String dersAdi) {
		this.setDersAdi(dersAdi);
	}
	//----------------------------------------

	public long getDersId() {
		return dersId;
	}
	public void setDersId(long dersId) {
		this.dersId = dersId;
	}

	public String getDersAdi() {
		return dersAdi;
	}
	public void setDersAdi(String dersAdi) {
		this.dersAdi = dersAdi;
	}

}
