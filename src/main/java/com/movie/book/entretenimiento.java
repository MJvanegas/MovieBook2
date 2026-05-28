package com.movie.book;

import jakarta.persistence.*;

@Entity
@Table(name = "entretenimiento")

public class Entretenimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(length = 500)
    private String comentario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getVistoPor() {
        return vistoPor;
    }

    public void setVistoPor(String vistoPor) {
        this.vistoPor = vistoPor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) { this.comentario = comentario; }
}