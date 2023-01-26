package com.apilayer.data.pokeapi.ability;

import java.util.List;

import com.apilayer.data.pokeapi.Effect;
import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.versiongroup.VersionGroup;

public class AbilityEffectChange {

	private List<Effect> effectEntries;
	private NamedApiResource<VersionGroup> versionGroup;
	
	public List<Effect> getEffectEntries() {
		return effectEntries;
	}
	public void setEffectEntries(List<Effect> effectEntries) {
		this.effectEntries = effectEntries;
	}
	public NamedApiResource<VersionGroup> getVersionGroup() {
		return versionGroup;
	}
	public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
		this.versionGroup = versionGroup;
	}
	
}
