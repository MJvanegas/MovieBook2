package com.movie.book;

import org.springframework.beans.factory.annotation.autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.service;
import java.util.list;

@Service
public class entretenimientoServicios {

    @autowired
    private entretenimientoRepositorio repository;

    public list<entretenimiento> obtenerTodos() {
        return repository.findAll();
    }

    public list<entretenimiento> obtenerPorTipo(String tipo) {
        return repository.findbytipo(tipo);
    }

    public void guardar(entretenimiento entretenimiento) {
        repository.Save(entretenimiento);
    }
}
