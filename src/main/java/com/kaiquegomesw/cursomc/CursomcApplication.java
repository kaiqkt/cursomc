package com.kaiquegomesw.cursomc;

import com.kaiquegomesw.cursomc.domain.entities.*;
import com.kaiquegomesw.cursomc.domain.entities.enums.TipoCliente;
import com.kaiquegomesw.cursomc.domain.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");

		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		Produto p4 = new Produto(null, "Mouse", 80.00);

		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2, p4));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		p4.getCategorias().add(cat2);

		Estado est1 = new Estado(null, "mg");
		Estado est2 = new Estado(null, "sp");

		Cidade c1 = new Cidade(null, "Uberlandia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Diadema", est2);

		est1.getCidades().add(c1);
		est2.getCidades().addAll(Arrays.asList(c2, c3));

		Cliente cl1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "36518689110", TipoCliente.PESSOA_FISICA);

		cl1.getTelefones().addAll(Arrays.asList("996198055", "54156320"));

		Endereco ed1 = new Endereco(null, "Rua Flores", "300", "Apto 303", "Jardim", "38220834", c1, cl1);
		Endereco ed2 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "38770012", c2, cl1);

		cl1.getEnderecos().addAll(Arrays.asList(ed1, ed2));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1,c2,c3));
		clienteRepository.save(cl1);
		enderecoRepository.saveAll(Arrays.asList(ed1, ed2));

	}
}
