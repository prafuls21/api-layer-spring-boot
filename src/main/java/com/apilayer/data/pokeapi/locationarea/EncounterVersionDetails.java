package com.apilayer.data.pokeapi.locationarea;

import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.version.Version;

public class EncounterVersionDetails {

	private Integer rate;
	private NamedApiResource<Version> version;
	
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public NamedApiResource<Version> getVersion() {
		return version;
	}
	public void setVersion(NamedApiResource<Version> version) {
		this.version = version;
	}
	
}
