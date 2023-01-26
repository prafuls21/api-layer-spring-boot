package com.apilayer.data.pokeapi.move;

import java.util.List;

import com.apilayer.data.pokeapi.NamedApiResource;

public class ContestComboDetail {

	private List<NamedApiResource<Move>> userBefore;
	private List<NamedApiResource<Move>> userAfter;
	
	public List<NamedApiResource<Move>> getUserBefore() {
		return userBefore;
	}
	public void setUserBefore(List<NamedApiResource<Move>> userBefore) {
		this.userBefore = userBefore;
	}
	public List<NamedApiResource<Move>> getUserAfter() {
		return userAfter;
	}
	public void setUserAfter(List<NamedApiResource<Move>> userAfter) {
		this.userAfter = userAfter;
	}
	
}
