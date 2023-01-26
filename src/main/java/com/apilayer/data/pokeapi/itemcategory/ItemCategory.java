package com.apilayer.data.pokeapi.itemcategory;

import java.util.List;

import com.apilayer.data.pokeapi.Name;
import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.PokeApiResource;
import com.apilayer.data.pokeapi.item.Item;
import com.apilayer.data.pokeapi.itempocket.ItemPocket;
import com.apilayer.data.pokeapi.locale.Localizable;

public class ItemCategory implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<NamedApiResource<Item>> items;
	private List<Name> names;
	private NamedApiResource<ItemPocket> pocket;
	
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
	public List<NamedApiResource<Item>> getItems() {
		return items;
	}
	public void setItems(List<NamedApiResource<Item>> items) {
		this.items = items;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public NamedApiResource<ItemPocket> getPocket() {
		return pocket;
	}
	public void setPocket(NamedApiResource<ItemPocket> pocket) {
		this.pocket = pocket;
	}
	
}
