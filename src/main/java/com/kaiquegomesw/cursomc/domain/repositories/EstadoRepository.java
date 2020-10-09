package com.kaiquegomesw.cursomc.domain.repositories;

import com.kaiquegomesw.cursomc.domain.entities.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
