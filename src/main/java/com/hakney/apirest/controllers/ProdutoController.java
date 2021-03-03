package com.hakney.apirest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hakney.apirest.models.Produto;
import com.hakney.apirest.repository.ProdutoRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ProdutoController {

	@Autowired
	ProdutoRepository repository;
	
	
	@GetMapping("/produtos")
	public List<Produto> listarProdutos(){
		return repository.findAll();
	}
	
	@GetMapping("/produto/{id}")
	public Optional<Produto> carregaProduto(@PathVariable("id") Long id) {
		return repository.findById(id);
	}
	
	@PostMapping("/produto")
	public Produto cadastrarProduto(@RequestBody Produto produto) {
		return repository.save(produto);
	}
	
	@PutMapping("/produto")
	public Produto atualizarProduto(@RequestBody Produto produto) {
		return repository.save(produto);
	}
	
	@DeleteMapping("/produto/{id}")
	public void deletarProduto(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}
}
