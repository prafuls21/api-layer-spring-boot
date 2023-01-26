package com.apilayer.service;

import com.apilayer.data.PokemonShortInfo;
import com.apilayer.data.pokeapi.pokemon.Pokemon;
import com.apilayer.service.api.APILayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
    private final APILayer apiLayer;

    public PokemonService(@Autowired APILayer apiLayer) {
        this.apiLayer = apiLayer;
    }

    public PokemonShortInfo getBlastoise(
    )  {
        // retrieving the desired Pokemon
        Pokemon blastoise = apiLayer.getPokemonAPI().getPokemonByName("blastoise");

        // transforming the original data into
        // the desired format
        PokemonShortInfo blastoiseShortInfo = new PokemonShortInfo();
        blastoiseShortInfo.setId(blastoise.getId());
        blastoiseShortInfo.setName(blastoise.getName());
        blastoiseShortInfo.setImage(blastoise.getSprites().getFrontDefault());
        blastoiseShortInfo.setHeight(String.format("%d cm", blastoise.getHeight() * 10));
        blastoiseShortInfo.setWeight(String.format("%d kg", blastoise.getWeight() / 10));

        return blastoiseShortInfo;
    }
}
