package com.leidy.heroes.controller;

import com.leidy.heroes.dto.HeroeDto;
import com.leidy.heroes.service.HeroesServiceArchivo;
import com.leidy.heroes.service.IHeroesService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.*;
import java.awt.event.MouseEvent;

public class HeroesController {
    public class HeroesController {
        @FXML
        public TextField txtId;
        @FXML
        public TextField txtNombre;
        @FXML
        public TableView<HeroeDto> tableHeroes;
        @FXML
        public TableColumn<HeroeDto, Integer> colId;
        @FXML
        public TableColumn<HeroeDto, String> colNombre;

        private final IHeroesService heroesService;

        public HeroesController() {
            this.heroesService = new IHeroesService();
        }

        @FXML
        public void handleCrear(MouseEvent mouseEvent) {
            Integer id = Integer.parseInt(txtId.getText());
            String nombre = txtNombre.getText();
            HeroeDto heroeDto = new HeroeDto(id, nombre);
            this.heroesService.crearHeroe(heroeDto);
        }

        @FXML
        public void handleSeleccionado(MouseEvent mouseEvent) {
            System.out.println(this.heroesService.obtenerHeroes().size());
            for (HeroeDto heroe : this.heroesService.obtenerHeroes()) {
                System.out.println(heroe);
            }
        }
    }
}