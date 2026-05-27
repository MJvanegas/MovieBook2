package com.movie.book;

import jakarta.persistence.*;

@Entity
@Table (name="entretenimiento")

public class entretenimiento {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String tipo;

    private Integer anio;

    @Column(nullable = false)
    private String estado;

    private Integer calificacion;

    @Column(name = name)
    private String vistoPor;




}
