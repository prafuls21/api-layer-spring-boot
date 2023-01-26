package com.apilayer.data.pokeapi.locationarea;

import java.util.List;

import com.apilayer.data.pokeapi.Name;
import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.PokeApiResource;
import com.apilayer.data.pokeapi.location.Location;
import com.apilayer.data.pokeapi.locale.Localizable;

public class LocationArea implements PokeApiResource, Localizable {

	private Integer Id;
	private String name;
	private Integer gameIndex;
	private List<EncounterMethodRate> encoutnerMethodRates;
	private NamedApiResource<Location> location;
	private List<Name> names;
	private List<PokemonEncounter> pokemonEncounters;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGameIndex() {
		return gameIndex;
	}
	public void setGameIndex(Integer gameIndex) {
		this.gameIndex = gameIndex;
	}
	public List<EncounterMethodRate> getEncoutnerMethodRates() {
		return encoutnerMethodRates;
	}
	public void setEncoutnerMethodRates(List<EncounterMethodRate> encoutnerMethodRates) {
		this.encoutnerMethodRates = encoutnerMethodRates;
	}
	public NamedApiResource<Location> getLocation() {
		return location;
	}
	public void setLocation(NamedApiResource<Location> location) {
		this.location = location;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<PokemonEncounter> getPokemonEncounters() {
		return pokemonEncounters;
	}
	public void setPokemonEncounters(List<PokemonEncounter> pokemonEncounters) {
		this.pokemonEncounters = pokemonEncounters;
	}
	
}
