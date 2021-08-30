package com.exercicio.LojaDeGames.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio.LojaDeGames.Model.Produtos;
import com.exercicio.LojaDeGames.Repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")
public class ProdutosController {
	
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produtos>> findAllProdutos (){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/idproduto/{id}")
	public ResponseEntity<Produtos> findById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricaoproduto/{descricaop}")
	public ResponseEntity<List<Produtos>>FindByDescricao (@PathVariable String descricaop){
		return ResponseEntity.ok(repository.findAllByDescricaopContainingIgnoreCase(descricaop));
	}
	
	@PostMapping("/novoproduto")
	public ResponseEntity<Produtos> postProduto (@Valid @RequestBody Produtos produtos) {
		return ResponseEntity.ok(repository.save(produtos));
	}
	
	@PutMapping("/atualizarproduto")
	public ResponseEntity<Produtos> putProduto (@Valid @RequestBody Produtos produtos){
		return ResponseEntity.ok(repository.save(produtos));
	}
	
	@DeleteMapping("/deletarproduto/{id}")
	public void Delete (@PathVariable Long id) {
		repository.deleteById(id);
	}
}
