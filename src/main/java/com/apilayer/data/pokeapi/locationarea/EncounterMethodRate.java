package com.apilayer.data.pokeapi.locationarea;

import java.util.List;

import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.encountermethod.EncounterMethod;

public class EncounterMethodRate {

	private NamedApiResource<EncounterMethod> encounterMethod;
	private List<EncounterVersionDetails> versionDetails;
	
	public NamedApiResource<EncounterMethod> getEncounterMethod() {
		return encounterMethod;
	}
	public void setEncounterMethod(NamedApiResource<EncounterMethod> encounterMethod) {
		this.encounterMethod = encounterMethod;
	}
	public List<EncounterVersionDetails> getVersionDetails() {
		return versionDetails;
	}
	public void setVersionDetails(List<EncounterVersionDetails> versionDetails) {
		this.versionDetails = versionDetails;
	}
	
}
