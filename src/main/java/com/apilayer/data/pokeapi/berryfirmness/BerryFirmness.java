package com.apilayer.data.pokeapi.berryfirmness;

import java.util.List;

import com.apilayer.data.pokeapi.Name;
import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.PokeApiResource;
import com.apilayer.data.pokeapi.berry.Berry;
import com.apilayer.data.pokeapi.locale.Localizable;

public class BerryFirmness implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<NamedApiResource<Berry>> berries;
	private List<Name> names;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<NamedApiResource<Berry>> getBerries() {
		return berries;
	}
	public void setBerries(List<NamedApiResource<Berry>> berries) {
		this.berries = berries;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	
}
