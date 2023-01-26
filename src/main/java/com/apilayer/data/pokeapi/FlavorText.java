package com.apilayer.data.pokeapi;

import com.apilayer.data.pokeapi.language.Language;
import com.apilayer.data.pokeapi.version.Version;

public class FlavorText {

	private String flavorText;
	private NamedApiResource<Language> language;
	private NamedApiResource<Version> version;
	
	public String getFlavorText() {
		return flavorText;
	}
	public void setFlavorText(String flavorText) {
		this.flavorText = flavorText;
	}
	public NamedApiResource<Language> getLanguage() {
		return language;
	}
	public void setLanguage(NamedApiResource<Language> language) {
		this.language = language;
	}
	public NamedApiResource<Version> getVersion() {
		return version;
	}
	public void setVersion(NamedApiResource<Version> version) {
		this.version = version;
	}
	
}
