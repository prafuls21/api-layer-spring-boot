package com.apilayer.data.pokeapi.locale;

import java.util.Optional;

import com.apilayer.data.pokeapi.Name;

public class PokeApiLocaleUtils {

	public static Optional<Name> getInLocale(Localizable localizable, String locale) {
		return localizable.getNames().stream()
				.filter(name -> name.getLanguage().getName().equalsIgnoreCase(locale))
				.findFirst();
	}
	
}
