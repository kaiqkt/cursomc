package com.kaiquegomesw.cursomc.domain.repositories;

import com.kaiquegomesw.cursomc.domain.entities.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
