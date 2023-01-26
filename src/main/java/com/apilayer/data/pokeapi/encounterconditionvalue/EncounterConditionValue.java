package com.apilayer.data.pokeapi.encounterconditionvalue;

import java.util.List;

import com.apilayer.data.pokeapi.Name;
import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.PokeApiResource;
import com.apilayer.data.pokeapi.encountercondition.EncounterCondition;
import com.apilayer.data.pokeapi.locale.Localizable;

public class EncounterConditionValue implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private NamedApiResource<EncounterCondition> condition;
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
	public NamedApiResource<EncounterCondition> getCondition() {
		return condition;
	}
	public void setCondition(NamedApiResource<EncounterCondition> condition) {
		this.condition = condition;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	
}
