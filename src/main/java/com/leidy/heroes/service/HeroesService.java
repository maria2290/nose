package com.leidy.heroes.service;

import com.leidy.heroes.dto.HeroeDto;

import java.util.ArrayList;

public class HeroesService {
    private ArrayList<HeroeDto> heroes;


    public HeroesService() {
        this.heroes = new ArrayList<>();
    }


    @Override
    public void crearHeroe(HeroeDto heroe) {
        this.heroes.add(heroe);
    }

    @Override
    public ArrayList<HeroeDto> obtenerHeroes() {
        return this.heroes;
    }
}

