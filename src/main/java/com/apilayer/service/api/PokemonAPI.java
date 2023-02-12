package com.apilayer.service.api;

import com.apilayer.data.pokeapi.NamedApiResourceList;
import com.apilayer.data.pokeapi.pokemon.Pokemon;
import com.apilayer.service.api.utils.APIHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class PokemonAPI {

    private final APIHandler apiHandler;

    private final String BASE_URL = "https://pokeapi.co/api/v2/pokemon/";

    PokemonAPI(@Autowired APIHandler apiHandler) {
        this.apiHandler = apiHandler;
    }

    public Pokemon getPokemonByName(String name) {
        // retrieving a single Pokemon by name
        ResponseEntity<Pokemon> response = apiHandler.callAPIOnce(
                BASE_URL + name,
                HttpMethod.GET,
                null,
                null,
                Pokemon.class
        );

        return response.getBody();
    }

    public NamedApiResourceList<Pokemon> getPokemonListPaginated(
            int offset,
            int limit
    ) {
        // building the API URL with query parameters
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(BASE_URL)
                .queryParam("offset", offset)
                .queryParam("limit", limit);

        // retrieving a list of Pokemon
        ResponseEntity<NamedApiResourceList> response = apiHandler.callAPIWithRetryLogic(
                builder.toUriString(),
                HttpMethod.GET,
                null,
                null,
                NamedApiResourceList.class
        );

        return response.getBody();
    }
}