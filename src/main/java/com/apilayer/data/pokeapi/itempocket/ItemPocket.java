package com.apilayer.data.pokeapi.itempocket;

import java.util.List;

import com.apilayer.data.pokeapi.Name;
import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.PokeApiResource;
import com.apilayer.data.pokeapi.itemcategory.ItemCategory;
import com.apilayer.data.pokeapi.locale.Localizable;

public class ItemPocket implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<NamedApiResource<ItemCategory>> categories;
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
	public List<NamedApiResource<ItemCategory>> getCategories() {
		return categories;
	}
	public void setCategories(List<NamedApiResource<ItemCategory>> categories) {
		this.categories = categories;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	
}
