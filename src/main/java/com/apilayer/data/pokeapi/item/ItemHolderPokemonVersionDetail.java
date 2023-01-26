package com.apilayer.data.pokeapi.item;

import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.version.Version;

public class ItemHolderPokemonVersionDetail {

	private Integer rarity;
	private NamedApiResource<Version> version;
	
	public Integer getRarity() {
		return rarity;
	}
	public void setRarity(Integer rarity) {
		this.rarity = rarity;
	}
	public NamedApiResource<Version> getVersion() {
		return version;
	}
	public void setVersion(NamedApiResource<Version> version) {
		this.version = version;
	}
	
}
