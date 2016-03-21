package com.mimaraslan.map;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "ogrenci_bilgisi", catalog = "denemevt")
public class OgrenciBilgisi {
/*
 	<class name="com.mimaraslan.map.OgrenciBilgisi" 
		   table="ogrenci_bilgisi"  
		   catalog="denemevt">	
 */
	
	@GenericGenerator(name = "generator", 
			strategy = "foreign", 
			parameters = @Parameter(name = "property", value = "ogrenci"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "OGRENCI_ID", unique = true, nullable = false)
	private Integer ogrenciId;
	/*
	 <id name="ogrenciId" type="java.lang.Integer">
		<column name="OGRENCI_ID" />
		<generator class="foreign">
			<param name="property">ogrenci</param>
		</generator>
	 </id> 
	  */
	
	@Column(name = "ADRES", nullable = false, length = 255)
	private String adres;
	/*
	   <property name="adres" type="string">
		  <column name="ADRES" length="255" not-null="true" />
	   </property>
	 */
	
	@Column(name = "KAYIT_NO", length = 20)
	private String kayitNo;
	/*
 		<property name="kayitNo" type="string">
			<column name="KAYIT_NO" length="20"  />
		</property>
	 */
	
	@Column(name = "TELEFON_N0", length = 50)	
	private String telefonNo;
	/*
	 	<property name="telefonNo" type="string">
			<column name="TELEFON_N0" length="50" />
		</property>
	 */
	
	@Column(name = "EMAIL", length = 255)	
	private String email;	
	/*
 		<property name="email" type="string">
			<column name="EMAIL" length="255" />
		</property>	
 	*/
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DOGUM_TARIHI", length = 10, nullable = false)
	private Date  dogumTarihi;
	/*
	 	<property name="dogumTarihi" type="date">
		    <column name="DOGUM_TARIHI" length="10" not-null="true" />
		</property>
	 */
	
	@Temporal(TemporalType.DATE)
	@Column(name = "KAYIT_TARIHI", length = 10, nullable = false)
	private Date kayitTarihi;	
	/*		
	    <property name="kayitTarihi" type="date">
		   <column name="KAYIT_TARIHI" length="10" not-null="true" />
		</property>
	*/
	
	@OneToOne(fetch = FetchType.LAZY)
 // @PrimaryKeyJoinColumn 
	/*Ek alan oluþturmadan yabancý anahtarýn eþlemesi yapar. 
	  Tablolar arasýnda fiziksel baðlantý olmaz!*/ 
	private Ogrenci ogrenci;
	/*
	 	<one-to-one name="ogrenci" 
					class="com.mimaraslan.map.Ogrenci"
					constrained="true"/>
	 */
	//------------------------------------------
	public Integer getOgrenciId() {
		return ogrenciId;
	}
	public void setOgrenciId(Integer ogrenciId) {
		this.ogrenciId = ogrenciId;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getKayitNo() {
		return kayitNo;
	}
	public void setKayitNo(String kayitNo) {
		this.kayitNo = kayitNo;
	}
	public String getTelefonNo() {
		return telefonNo;
	}
	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(Date dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	public Date getKayitTarihi() {
		return kayitTarihi;
	}
	public void setKayitTarihi(Date kayitTarihi) {
		this.kayitTarihi = kayitTarihi;
	}
	public Ogrenci getOgrenci() {
		return ogrenci;
	}
	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}
	

	
	
}
