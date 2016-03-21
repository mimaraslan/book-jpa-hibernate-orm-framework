package com.mimaraslan.kurum;

public class Adres implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private long adresId;
	private String cadde;
	private String sehir;
	private String semt;
	private String postakodu;
	//---------------------------------------------------
	public Adres() {
	}

	public Adres(String cadde, String sehir, 
				 String semt, String postakodu) {
		this.cadde = cadde;
		this.sehir = sehir;
		this.semt = semt;
		this.postakodu = postakodu;
	}
	//---------------------------------------------------
	public long getAdresId() {
		return adresId;
	}
	public void setAdresId(long adresId) {
		this.adresId = adresId;
	}

	public String getCadde() {
		return cadde;
	}
	public void setCadde(String cadde) {
		this.cadde = cadde;
	}

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

	public String getPostakodu() {
		return postakodu;
	}
	public void setPostakodu(String postakodu) {
		this.postakodu = postakodu;
	}
}
