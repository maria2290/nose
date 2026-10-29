package com.leidy.heroes.service;

import com.leidy.heroes.dto.HeroeDto;

import java.util.ArrayList;

public interface IHeroesService {
    void crearheroe(HeroeDto heroe);
    ArrayList<HeroeDto> obtenerHeroes();
}
