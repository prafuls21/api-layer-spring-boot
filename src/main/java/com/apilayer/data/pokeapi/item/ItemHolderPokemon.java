package com.apilayer.data.pokeapi.item;

import java.util.List;

import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.pokemon.Pokemon;

public class ItemHolderPokemon {

	private NamedApiResource<Pokemon> pokemon;
	private List<ItemHolderPokemonVersionDetail> versionDetails;
	
	public NamedApiResource<Pokemon> getPokemon() {
		return pokemon;
	}
	public void setPokemon(NamedApiResource<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}
	public List<ItemHolderPokemonVersionDetail> getVersionDetails() {
		return versionDetails;
	}
	public void setVersionDetails(List<ItemHolderPokemonVersionDetail> versionDetails) {
		this.versionDetails = versionDetails;
	}
	
}
