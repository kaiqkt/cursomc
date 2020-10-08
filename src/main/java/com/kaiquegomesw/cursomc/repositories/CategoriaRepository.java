package com.kaiquegomesw.cursomc.repositories;

import com.kaiquegomesw.cursomc.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
