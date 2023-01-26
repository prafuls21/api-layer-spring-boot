package com.apilayer.data.pokeapi.pokemonspecies;

import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.pokedex.Pokedex;

public class PokemonSpeciesDexEntry {

	private Integer entryNumber;
	private NamedApiResource<Pokedex> pokedex;
	
	public Integer getEntryNumber() {
		return entryNumber;
	}
	public void setEntryNumber(Integer entryNumber) {
		this.entryNumber = entryNumber;
	}
	public NamedApiResource<Pokedex> getPokedex() {
		return pokedex;
	}
	public void setPokedex(NamedApiResource<Pokedex> pokedex) {
		this.pokedex = pokedex;
	}
	
}
