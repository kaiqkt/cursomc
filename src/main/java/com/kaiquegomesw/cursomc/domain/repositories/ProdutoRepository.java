package com.kaiquegomesw.cursomc.domain.repositories;

import com.kaiquegomesw.cursomc.domain.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
