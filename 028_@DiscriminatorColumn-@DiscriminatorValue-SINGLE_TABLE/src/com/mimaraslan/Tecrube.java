package com.mimaraslan;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue (value = "TECRÜBE")
public class Tecrube extends Sektor {
	private int deneyimYili;

	public int getDeneyimYili() {
		return deneyimYili;
	}

	public void setDeneyimYili(int deneyimYili) {
		this.deneyimYili = deneyimYili;
	}
	
}
