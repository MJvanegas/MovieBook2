package com.movie.book;

import org.springframework.beans.factory.annotation.autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class entretenimientoControl {

    @autowired
    private entretenimientoServicios Service;

    @GetMapping ("/")
    public String MostrarPagPrincipal (Model model)
    {
        model.addAttribute("Todos", Service.obtenerTodos());
        model.addAttribute("Películas", Service.obtenerPorTipo("Pel[iculas"));
        model.addAttribute("Series", Service.obtenerPorTipo("Series"));
        model.addAttribute("Libros", Service.obtenerPorTipo("Libros"));
        
        model.addAttribute("Nuevo Registro", new Entretenimiento ());

        return "index";
    }

    @PostMapping("/guardar")
    public String guardarRegistro(@ModelAttribute("Nuevo Registro") Entretenimiento entretenimiento){
        service.guardarRegistro(entretenimiento);
        return "redirect:/";
    }
}