package com.apilayer.service.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class APILayer {

    private final PokemonAPI pokemonAPI;

    APILayer(@Autowired PokemonAPI pokemonAPI) {
        this.pokemonAPI = pokemonAPI;
    }

    public PokemonAPI getPokemonAPI() {
        return pokemonAPI;
    }
}
