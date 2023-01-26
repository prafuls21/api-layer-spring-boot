package com.apilayer.data.pokeapi.contesttype;

import java.util.List;

import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.PokeApiResource;
import com.apilayer.data.pokeapi.berryflavor.BerryFlavor;

public class ContestType implements PokeApiResource {

	private Integer id;
	private String name;
	private NamedApiResource<BerryFlavor> berryFlavor;
	private List<ContestName> names;
	
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
	public NamedApiResource<BerryFlavor> getBerryFlavor() {
		return berryFlavor;
	}
	public void setBerryFlavor(NamedApiResource<BerryFlavor> berryFlavor) {
		this.berryFlavor = berryFlavor;
	}
	public List<ContestName> getNames() {
		return names;
	}
	public void setNames(List<ContestName> names) {
		this.names = names;
	}
	
}
