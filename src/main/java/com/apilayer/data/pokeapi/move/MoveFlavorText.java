package com.apilayer.data.pokeapi.move;

import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.language.Language;
import com.apilayer.data.pokeapi.versiongroup.VersionGroup;

public class MoveFlavorText {

	private String flavorText;
	private NamedApiResource<Language> language;
	private NamedApiResource<VersionGroup> versionGroup;
	
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
	public NamedApiResource<VersionGroup> getVersionGroup() {
		return versionGroup;
	}
	public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
		this.versionGroup = versionGroup;
	}
	
}
