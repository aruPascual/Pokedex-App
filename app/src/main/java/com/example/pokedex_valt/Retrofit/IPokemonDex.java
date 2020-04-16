package com.example.pokedex_valt.Retrofit;

import com.example.pokedex_valt.Model.Pokedex;

import java.util.Observable;

import retrofit2.http.GET;

public interface IPokemonDex {
    @GET("pokedex.json")
    Observable getListPokemon();
}
