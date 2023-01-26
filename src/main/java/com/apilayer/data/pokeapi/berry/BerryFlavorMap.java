package com.apilayer.data.pokeapi.berry;

import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.berryflavor.BerryFlavor;

public class BerryFlavorMap {

	private Integer potency;
	private NamedApiResource<BerryFlavor> flavor;
	
	public Integer getPotency() {
		return potency;
	}
	public void setPotency(Integer potency) {
		this.potency = potency;
	}
	public NamedApiResource<BerryFlavor> getFlavor() {
		return flavor;
	}
	public void setFlavor(NamedApiResource<BerryFlavor> flavor) {
		this.flavor = flavor;
	}
	
}
