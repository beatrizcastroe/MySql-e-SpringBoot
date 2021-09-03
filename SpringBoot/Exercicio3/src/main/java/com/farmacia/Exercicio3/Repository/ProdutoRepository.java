package com.farmacia.Exercicio3.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.Exercicio3.Model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

		public List<Produto>findAllByDescricaopContainingIgnoreCase(String descricaop);

	
}
