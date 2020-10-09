package com.kaiquegomesw.cursomc.repositories;

import com.kaiquegomesw.cursomc.entities.Categoria;
import com.kaiquegomesw.cursomc.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
