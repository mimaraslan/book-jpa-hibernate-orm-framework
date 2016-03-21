package com.mimaraslan.map;
import java.util.Date;

public class Calisan {
	private Long calisanId;
	private String calisanAdi;
	private String calisanSoyadi;
	private Date calisanDogumTarihi;
	private String calisanTelefonNo;
	private Departman departman;
//-------------------------------------
	public Calisan() {
	}

	public Calisan(String calisanAdi, String calisanSoyadi,
			String calisanTelefonNo) {
		this.calisanAdi = calisanAdi;
		this.calisanSoyadi = calisanSoyadi;
		this.calisanTelefonNo = calisanTelefonNo;
	}
	
	public Calisan(String calisanAdi, String calisanSoyadi,
			Date calisanDogumTarihi, String calisanTelefonNo) {
		this.calisanAdi = calisanAdi;
		this.calisanSoyadi = calisanSoyadi;
		this.calisanDogumTarihi = calisanDogumTarihi;
		this.calisanTelefonNo = calisanTelefonNo;
	}
//-------------------------------------
	public Long getCalisanId() {
		return calisanId;
	}

	public void setCalisanId(Long calisanId) {
		this.calisanId = calisanId;
	}

	public String getCalisanAdi() {
		return calisanAdi;
	}

	public void setCalisanAdi(String calisanAdi) {
		this.calisanAdi = calisanAdi;
	}

	public String getCalisanSoyadi() {
		return calisanSoyadi;
	}

	public void setCalisanSoyadi(String calisanSoyadi) {
		this.calisanSoyadi = calisanSoyadi;
	}

	public Date getCalisanDogumTarihi() {
		return calisanDogumTarihi;
	}

	public void setCalisanDogumTarihi(Date calisanDogumTarihi) {
		this.calisanDogumTarihi = calisanDogumTarihi;
	}

	public String getCalisanTelefonNo() {
		return calisanTelefonNo;
	}

	public void setCalisanTelefonNo(String calisanTelefonNo) {
		this.calisanTelefonNo = calisanTelefonNo;
	}

	public Departman getDepartman() {
		return departman;
	}

	public void setDepartman(Departman departman) {
		this.departman = departman;
	}
	
	

	
}
