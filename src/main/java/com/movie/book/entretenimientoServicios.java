package com.movie.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EntretenimientoServicios {

    @Autowired
    private EntretenimientoRepositorio repository;

    public List<Entretenimiento> obtenerTodos() {
        return repository.findAll();
    }

    public List<Entretenimiento> obtenerPorTipo(String tipo) {
        return repository.findByTipo(tipo);
    }

    public void guardarRegistro(Entretenimiento entretenimiento) {
        repository.save(entretenimiento);
    }
}