package com.apilayer.data.pokeapi.locationarea;

import java.util.List;

import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.VersionEncounterDetail;
import com.apilayer.data.pokeapi.pokemon.Pokemon;

public class PokemonEncounter {

	private NamedApiResource<Pokemon> pokemon;
	private List<VersionEncounterDetail> versionDetails;
	
	public NamedApiResource<Pokemon> getPokemon() {
		return pokemon;
	}
	public void setPokemon(NamedApiResource<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}
	public List<VersionEncounterDetail> getVersionDetails() {
		return versionDetails;
	}
	public void setVersionDetails(List<VersionEncounterDetail> versionDetails) {
		this.versionDetails = versionDetails;
	}
	
}
