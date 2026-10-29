package com.leidy.heroes.service;

import com.leidy.heroes.dao.HeroesDao;
import com.leidy.heroes.dto.HeroeDto;

import java.util.ArrayList;

public class HeroesServiceArchivo {
    private HeroesDao heroesDao;

    public HeroesServiceArchivo() {
        this.heroesDao = new HeroesDao();
    }

    @Override
    public void crearHeroe(HeroeDto heroe) {
        ArrayList<HeroeDto> listado = this.heroesDao.obtenerHeroes();
        listado.add(heroe);
        this.heroesDao.guardarHeroes(listado);
    }

    public ArrayList<HeroeDto> obtenerHeroes() {
        return this.heroesDao.obtenerHeroes();
    }
}
