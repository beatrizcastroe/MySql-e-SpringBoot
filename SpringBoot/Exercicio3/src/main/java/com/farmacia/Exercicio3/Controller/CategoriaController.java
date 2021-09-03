package com.farmacia.Exercicio3.Controller;

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

import com.farmacia.Exercicio3.Model.Categoria;
import com.farmacia.Exercicio3.Repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
@CrossOrigin("*")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository sql;

	@GetMapping
	public ResponseEntity<List<Categoria>> GetAll (){
		return ResponseEntity.ok(sql.findAll());
	}
	
	@PostMapping("/novacategoria")
	public ResponseEntity<Categoria> novaCategoria (@Valid @RequestBody Categoria categoria){
		return ResponseEntity.ok(sql.save(categoria));
	}
	
	@PutMapping("/attcategoria")
	public ResponseEntity<Categoria> attCategoria (@Valid @RequestBody Categoria categoria){
		return ResponseEntity.ok(sql.save(categoria));
	}
	
	@DeleteMapping("/deletar/{id}")
	public void Delete (@PathVariable Long id) {
		sql.deleteById(id);
	}
	
	@GetMapping("/buscarid/{id}")
	public ResponseEntity<Categoria> FindById (@PathVariable Long id){
		return sql.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/buscardescricao/{descricao}")
	public ResponseEntity<List<Categoria>> FindByDescricao (@PathVariable String descricao) {
		return ResponseEntity.ok(sql.findAllByDescricaoContainingIgnoreCase(descricao));
	}
}
