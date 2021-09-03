package com.farmacia.Exercicio3.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.Exercicio3.Model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

		public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);


}
