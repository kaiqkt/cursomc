package com.kaiquegomesw.cursomc;

import com.kaiquegomesw.cursomc.entities.Categoria;
import com.kaiquegomesw.cursomc.entities.Produto;
import com.kaiquegomesw.cursomc.repositories.CategoriaRepository;
import com.kaiquegomesw.cursomc.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	CategoriaRepository repository;

	@Autowired
	ProdutoRepository pRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null,"informatica");
		Categoria cat2 = new Categoria(null,"escritorio");

		Produto prod1 = new Produto(null, "computado", 2000.0);
		Produto prod2 = new Produto(null, "impressora", 800.0);
		Produto prod3  = new Produto(null, "mouse", 80.0);

		cat1.getProdutos().addAll(Arrays.asList(prod1, prod2, prod3));
		cat2.getProdutos().addAll(Arrays.asList(prod2));

		prod1.getCategorias().addAll(Arrays.asList(cat1));
		prod2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		prod3.getCategorias().addAll(Arrays.asList(cat1));

		repository.saveAll(Arrays.asList(cat1, cat2));
		pRepository.saveAll(Arrays.asList(prod1, prod2, prod3));
	}
}
