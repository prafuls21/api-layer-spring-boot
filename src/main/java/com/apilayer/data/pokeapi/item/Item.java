package com.apilayer.data.pokeapi.item;

import java.util.List;

import com.apilayer.data.pokeapi.ApiResource;
import com.apilayer.data.pokeapi.GenerationGameIndex;
import com.apilayer.data.pokeapi.MachineVersionDetail;
import com.apilayer.data.pokeapi.Name;
import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.PokeApiResource;
import com.apilayer.data.pokeapi.VerboseEffect;
import com.apilayer.data.pokeapi.VersionGroupFlavorText;
import com.apilayer.data.pokeapi.evolutionchain.EvolutionChain;
import com.apilayer.data.pokeapi.itemattribute.ItemAttribute;
import com.apilayer.data.pokeapi.itemcategory.ItemCategory;
import com.apilayer.data.pokeapi.itemflingeffect.ItemFlingEffect;
import com.apilayer.data.pokeapi.locale.Localizable;

public class Item implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private Integer cost;
	private Integer flingPower;
	private NamedApiResource<ItemFlingEffect> flingEffect;
	private List<NamedApiResource<ItemAttribute>> attributes;
	private List<NamedApiResource<ItemCategory>> category;
	private List<VerboseEffect> effectEntries;
	private List<VersionGroupFlavorText> flavorTextEntries;
	private List<GenerationGameIndex> gameIndices;
	private List<Name> names;
	private ItemSprites sprites;
	private List<ItemHolderPokemon> heldByPokemon;
	private ApiResource<EvolutionChain> babyTriggerFor;
	private List<MachineVersionDetail> machines;
	
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
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public Integer getFlingPower() {
		return flingPower;
	}
	public void setFlingPower(Integer flingPower) {
		this.flingPower = flingPower;
	}
	public NamedApiResource<ItemFlingEffect> getFlingEffect() {
		return flingEffect;
	}
	public void setFlingEffect(NamedApiResource<ItemFlingEffect> flingEffect) {
		this.flingEffect = flingEffect;
	}
	public List<NamedApiResource<ItemAttribute>> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<NamedApiResource<ItemAttribute>> attributes) {
		this.attributes = attributes;
	}
	public List<NamedApiResource<ItemCategory>> getCategory() {
		return category;
	}
	public void setCategory(List<NamedApiResource<ItemCategory>> category) {
		this.category = category;
	}
	public List<VerboseEffect> getEffectEntries() {
		return effectEntries;
	}
	public void setEffectEntries(List<VerboseEffect> effectEntries) {
		this.effectEntries = effectEntries;
	}
	public List<VersionGroupFlavorText> getFlavorTextEntries() {
		return flavorTextEntries;
	}
	public void setFlavorTextEntries(List<VersionGroupFlavorText> flavorTextEntries) {
		this.flavorTextEntries = flavorTextEntries;
	}
	public List<GenerationGameIndex> getGameIndices() {
		return gameIndices;
	}
	public void setGameIndices(List<GenerationGameIndex> gameIndices) {
		this.gameIndices = gameIndices;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public ItemSprites getSprites() {
		return sprites;
	}
	public void setSprites(ItemSprites sprites) {
		this.sprites = sprites;
	}
	public List<ItemHolderPokemon> getHeldByPokemon() {
		return heldByPokemon;
	}
	public void setHeldByPokemon(List<ItemHolderPokemon> heldByPokemon) {
		this.heldByPokemon = heldByPokemon;
	}
	public ApiResource<EvolutionChain> getBabyTriggerFor() {
		return babyTriggerFor;
	}
	public void setBabyTriggerFor(ApiResource<EvolutionChain> babyTriggerFor) {
		this.babyTriggerFor = babyTriggerFor;
	}
	public List<MachineVersionDetail> getMachines() {
		return machines;
	}
	public void setMachines(List<MachineVersionDetail> machines) {
		this.machines = machines;
	}
	
}
