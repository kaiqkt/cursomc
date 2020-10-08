package com.kaiquegomesw.cursomc.service;

import com.kaiquegomesw.cursomc.entities.Categoria;
import com.kaiquegomesw.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Optional<Categoria> buscar(Integer id) {
        return repository.findById(id);
    }
}