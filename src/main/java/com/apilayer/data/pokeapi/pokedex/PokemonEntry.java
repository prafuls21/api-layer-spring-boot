package com.apilayer.data.pokeapi.pokedex;

import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.pokemonspecies.PokemonSpecies;

public class PokemonEntry {

	private Integer entryNumber;
	private NamedApiResource<PokemonSpecies> pokemonSpecies;
	
	public Integer getEntryNumber() {
		return entryNumber;
	}
	public void setEntryNumber(Integer entryNumber) {
		this.entryNumber = entryNumber;
	}
	public NamedApiResource<PokemonSpecies> getPokemonSpecies() {
		return pokemonSpecies;
	}
	public void setPokemonSpecies(NamedApiResource<PokemonSpecies> pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}
	
}
