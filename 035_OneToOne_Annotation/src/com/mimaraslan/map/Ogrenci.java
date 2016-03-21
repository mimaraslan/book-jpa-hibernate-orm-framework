package com.mimaraslan.map;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ogrenci", catalog = "denemevt")
public class Ogrenci implements java.io.Serializable {
/*
   <class name="com.mimaraslan.map.Ogrenci" 
    	   table="ogrenci" 
    	   catalog="denemevt">
 */
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "OGRENCI_ID", unique = true, nullable = false)
	private Integer ogrenciId;
	/*
	  <id name="ogrenciId" type="java.lang.Integer">
         <column name="OGRENCI_ID" />
         <generator class="identity" />
      </id>
	 */
		
	@Column(name = "OGRENCI_ADI", nullable = false, length = 50)
	private String  ogrenciAdi;
	/*
	   <property name="ogrenciAdi" type="string">
            <column name="OGRENCI_ADI" 
            		length="50" not-null="true" unique="true" />
        </property>
	 */

	@Column(name = "OGRENCI_SOYADI", nullable = false, length = 50)
	private String  ogrenciSoyadi;
	
	/*
	  <property name="ogrenciSoyadi" type="string">
            <column name="OGRENCI_SOYADI" 
            		length="50" not-null="true" unique="true" />
        </property>
	 */
	
	@OneToOne(mappedBy = "ogrenci", cascade = CascadeType.ALL)
	private OgrenciBilgisi ogrenciBilgisi;
	/*
	     <one-to-one name="ogrenciBilgisi" 
        			class="com.mimaraslan.map.OgrenciBilgisi"
					cascade="save-update"></one-to-one>
	 */
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