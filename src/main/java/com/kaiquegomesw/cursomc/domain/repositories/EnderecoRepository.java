package com.kaiquegomesw.cursomc.domain.repositories;

import com.kaiquegomesw.cursomc.domain.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
