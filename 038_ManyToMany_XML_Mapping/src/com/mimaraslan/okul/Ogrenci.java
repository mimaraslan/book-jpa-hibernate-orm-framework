package com.mimaraslan.okul;

import java.util.HashSet;
import java.util.Set;

public class Ogrenci implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private long ogrenciId;
	private String ogrenciAdi;
	private Set<Ders> dersler = new HashSet<Ders>(0);
	//----------------------------------------
	public Ogrenci() {
	}

	public Ogrenci(String ogrenciAdi) {
		this.setOgrenciAdi(ogrenciAdi);
	}

	public Ogrenci(String ogrenciAdi, Set<Ders> dersler) {
		this.setOgrenciAdi(ogrenciAdi);
		this.setDersler(dersler);
	}
	//----------------------------------------

	public long getOgrenciId() {
		return ogrenciId;
	}
	public void setOgrenciId(long ogrenciId) {
		this.ogrenciId = ogrenciId;
	}

	public String getOgrenciAdi() {
		return ogrenciAdi;
	}
	public void setOgrenciAdi(String ogrenciAdi) {
		this.ogrenciAdi = ogrenciAdi;
	}

	public Set<Ders> getDersler() {
		return dersler;
	}
	public void setDersler(Set<Ders> dersler) {
		this.dersler = dersler;
	}
	

}
