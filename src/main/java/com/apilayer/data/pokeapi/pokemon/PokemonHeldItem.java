package com.apilayer.data.pokeapi.pokemon;

import java.util.List;

import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.item.Item;

public class PokemonHeldItem {

	private NamedApiResource<Item> item;
	private List<PokemonHeldItemVersion> versionDetails;
	
	public NamedApiResource<Item> getItem() {
		return item;
	}
	public void setItem(NamedApiResource<Item> item) {
		this.item = item;
	}
	public List<PokemonHeldItemVersion> getVersionDetails() {
		return versionDetails;
	}
	public void setVersionDetails(List<PokemonHeldItemVersion> versionDetails) {
		this.versionDetails = versionDetails;
	}
	
}
