package com.apilayer.data.pokeapi.encountercondition;

import java.util.List;

import com.apilayer.data.pokeapi.Name;
import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.PokeApiResource;
import com.apilayer.data.pokeapi.encounterconditionvalue.EncounterConditionValue;
import com.apilayer.data.pokeapi.locale.Localizable;

public class EncounterCondition implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<Name> names;
	private List<NamedApiResource<EncounterConditionValue>> values;
	
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
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<NamedApiResource<EncounterConditionValue>> getValues() {
		return values;
	}
	public void setValues(List<NamedApiResource<EncounterConditionValue>> values) {
		this.values = values;
	}
	
}
