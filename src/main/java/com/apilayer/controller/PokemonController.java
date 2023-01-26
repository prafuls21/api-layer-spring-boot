package com.apilayer.controller;

import com.apilayer.data.PokemonShortInfo;
import com.apilayer.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {
    private final PokemonService pokemonService;

    public PokemonController(@Autowired PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }
    @GetMapping("/api/v1/pokemon/getBlastoise")
    public ResponseEntity<PokemonShortInfo> getBlastoise()  {
        PokemonShortInfo blastoise = pokemonService.getBlastoise();

        return new ResponseEntity<>(
                blastoise,
                HttpStatus.OK
        );
    }
}
