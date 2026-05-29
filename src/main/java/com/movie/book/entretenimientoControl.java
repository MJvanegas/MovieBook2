package com.movie.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EntretenimientoControl {

    @Autowired
    private EntretenimientoServicios service;

    @GetMapping("/")
    public String mostrarPagPrincipal(Model model) {
        model.addAttribute("Todos", service.obtenerTodos());
        model.addAttribute("Peliculas", service.obtenerPorTipo("Película"));
        model.addAttribute("Series", service.obtenerPorTipo("Serie"));
        model.addAttribute("Libros", service.obtenerPorTipo("Libro"));
        
        model.addAttribute("nuevoRegistro", new Entretenimiento());

        return "index";
    }

    @PostMapping("/guardar")
    public String guardarRegistro(@ModelAttribute("nuevoRegistro") Entretenimiento entretenimiento) {
        service.guardarRegistro(entretenimiento);
        return "redirect:/";
    }
}