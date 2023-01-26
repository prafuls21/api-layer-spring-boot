package com.apilayer.data.pokeapi.movelearnmethod;

import java.util.List;

import com.apilayer.data.pokeapi.Description;
import com.apilayer.data.pokeapi.Name;
import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.PokeApiResource;
import com.apilayer.data.pokeapi.versiongroup.VersionGroup;
import com.apilayer.data.pokeapi.locale.Localizable;

public class MoveLearnMethod implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<Description> descriptions;
	private List<Name> names;
	private List<NamedApiResource<VersionGroup>> versionGroups;
	
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
	public List<Description> getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<NamedApiResource<VersionGroup>> getVersionGroups() {
		return versionGroups;
	}
	public void setVersionGroups(List<NamedApiResource<VersionGroup>> versionGroups) {
		this.versionGroups = versionGroups;
	}
	
}
