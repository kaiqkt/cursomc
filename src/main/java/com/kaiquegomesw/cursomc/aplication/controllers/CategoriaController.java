package com.kaiquegomesw.cursomc.aplication.controllers;

import com.kaiquegomesw.cursomc.domain.entities.Categoria;
import com.kaiquegomesw.cursomc.domain.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    CategoriaService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Optional<Categoria> categoria = service.buscar(id);

        return ResponseEntity.ok().body(categoria);
    }
}
