package com.mimaraslan;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable 
//BU SINIF BASKA VARLIK SINIFLARI TARAFINDAN CAGIRILIP 
//BIR ALAN GIBI KULLANILACAK GÖMÜLECEK
public class Adres {
	
	@Column(name="IL_ADI")
	private String sehir;
	
	@Column(name="ILCE_ADI")
	private String semt;
	
	@Column(name="CADDE_ADI")
	private String cadde;
	
	@Column(name="KAPI_NO")
	private String kapiNo;
	
	@Column(name="POSTA_KODU_NO")
	private String postaKodu;
	
	
	
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	public String getSemt() {
		return semt;
	}
	public void setSemt(String semt) {
		this.semt = semt;
	}
	
	public String getCadde() {
		return cadde;
	}
	public void setCadde(String cadde) {
		this.cadde = cadde;
	}
	public String getKapiNo() {
		return kapiNo;
	}
	public void setKapiNo(String kapiNo) {
		this.kapiNo = kapiNo;
	}
	
	public String getPostaKodu() {
		return postaKodu;
	}
	public void setPostaKodu(String postaKodu) {
		this.postaKodu = postaKodu;
	}
	
	
	

}
