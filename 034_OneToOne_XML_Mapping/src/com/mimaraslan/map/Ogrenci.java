package com.mimaraslan.map;

public class Ogrenci implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer ogrenciId;
	private String  ogrenciAdi;
	private String  ogrenciSoyadi;
	private OgrenciBilgisi ogrenciBilgisi;
	//------------------------------------------
	public Ogrenci() {
	}

	public Ogrenci(String ogrenciAdi, String ogrenciSoyadi) {
		this.ogrenciAdi = ogrenciAdi;
		this.ogrenciSoyadi = ogrenciSoyadi;
	}
	//------------------------------------------

	public Integer getOgrenciId() {
		return ogrenciId;
	}

	public void setOgrenciId(Integer ogrenciId) {
		this.ogrenciId = ogrenciId;
	}

	public String getOgrenciAdi() {
		return ogrenciAdi;
	}

	public void setOgrenciAdi(String ogrenciAdi) {
		this.ogrenciAdi = ogrenciAdi;
	}

	public String getOgrenciSoyadi() {
		return ogrenciSoyadi;
	}

	public void setOgrenciSoyadi(String ogrenciSoyadi) {
		this.ogrenciSoyadi = ogrenciSoyadi;
	}

	public OgrenciBilgisi getOgrenciBilgisi() {
		return ogrenciBilgisi;
	}

	public void setOgrenciBilgisi(OgrenciBilgisi ogrenciBilgisi) {
		this.ogrenciBilgisi = ogrenciBilgisi;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}