package com.apilayer.data.pokeapi.berryflavor;

import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.berry.Berry;

public class FlavorBerryMap {

	private Integer potency;
	private NamedApiResource<Berry> berry;
	
	public Integer getPotency() {
		return potency;
	}
	public void setPotency(Integer potency) {
		this.potency = potency;
	}
	public NamedApiResource<Berry> getBerry() {
		return berry;
	}
	public void setBerry(NamedApiResource<Berry> berry) {
		this.berry = berry;
	}
	
}
