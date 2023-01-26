package com.apilayer.data.pokeapi.pokemon;

import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.version.Version;

public class PokemonHeldItemVersion {

	private NamedApiResource<Version> version;
	private Integer rarity;
	
	public NamedApiResource<Version> getVersion() {
		return version;
	}
	public void setVersion(NamedApiResource<Version> version) {
		this.version = version;
	}
	public Integer getRarity() {
		return rarity;
	}
	public void setRarity(Integer rarity) {
		this.rarity = rarity;
	}
	
}
