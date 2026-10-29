package com.leidy.heroes.dao;

import com.leidy.heroes.dto.HeroeDto;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class HeroesDao {
    private Path archivo;
    private String NOMBRE_ARCHIVO = "heroes.json";
    private Gson gson;

    public HeroesDao() {
        this.archivo = Path.of(System.getProperty("user.home"), NOMBRE_ARCHIVO);
        System.out.println("HeroesDao archivo: " + this.archivo);
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public void guardarHeroes(ArrayList<HeroeDto> heroes) {
        try {
            String datos = this.gson.toJson(heroes);
            Files.writeString(this.archivo, datos);
        } catch (IOException e) {
            System.out.println("HeroesDao guardarHeroes: " + e.getMessage());
        }

    }

    public ArrayList<HeroeDto> obtenerHeroes() {
        try {
            String datos = Files.readString(this.archivo);
            Type tipoLista = new TypeToken<ArrayList<HeroeDto>>() {
            }.getType();
            ArrayList<HeroeDto> listado = this.gson.fromJson(datos, tipoLista);
            if (listado == null) {
                return new ArrayList<>();
            }
            return listado;
        } catch (IOException e) {
            return new ArrayList<>();
        }

    }
}