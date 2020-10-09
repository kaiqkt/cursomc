package com.kaiquegomesw.cursomc.domain.service;

import com.kaiquegomesw.cursomc.domain.entities.Categoria;
import com.kaiquegomesw.cursomc.aplication.exceptions.ObjectNotFoundException;
import com.kaiquegomesw.cursomc.domain.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {


    @Autowired
    private CategoriaRepository repo;


    public Optional<Categoria> buscar(Integer id) {
        Optional<Categoria> obj = repo.findById(id);

        if (!obj.isPresent()) {
            throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
                    + ", Tipo: " + Categoria.class.getName());
        }
        return obj;
    }
}
