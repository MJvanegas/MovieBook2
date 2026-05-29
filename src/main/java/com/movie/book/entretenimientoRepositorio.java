package com.movie.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository 
public interface EntretenimientoRepositorio extends JpaRepository<Entretenimiento, Long> {
    List<Entretenimiento> findByTipo(String tipo);
}