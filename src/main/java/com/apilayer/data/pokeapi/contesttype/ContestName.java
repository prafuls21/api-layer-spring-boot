package com.apilayer.data.pokeapi.contesttype;

import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.language.Language;

public class ContestName {

	private String name;
	private String color;
	private NamedApiResource<Language> language;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public NamedApiResource<Language> getLanguage() {
		return language;
	}
	public void setLanguage(NamedApiResource<Language> language) {
		this.language = language;
	}
	
}
