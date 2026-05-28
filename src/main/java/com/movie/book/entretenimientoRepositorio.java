package com.movie.book;

import org.springframework.data.jpa.repository.jparepository;
import org.springframework.stereotype.repository;
import java.util.list;

@repository 
public interface entretenimientoRepositorio extends jparepository<entretenimiento,Long> 
{
list <entretenimiento> findbytipo(string tipo);

    
}