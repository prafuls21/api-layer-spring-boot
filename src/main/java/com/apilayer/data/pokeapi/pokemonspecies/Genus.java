package com.apilayer.data.pokeapi.pokemonspecies;

import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.language.Language;

public class Genus {

	private String genus;
	private NamedApiResource<Language> language;
	
	public String getGenus() {
		return genus;
	}
	public void setGenus(String genus) {
		this.genus = genus;
	}
	public NamedApiResource<Language> getLanguage() {
		return language;
	}
	public void setLanguage(NamedApiResource<Language> language) {
		this.language = language;
	}
	
}
