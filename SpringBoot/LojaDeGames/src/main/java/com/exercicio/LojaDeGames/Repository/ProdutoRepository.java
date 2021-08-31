package com.exercicio.LojaDeGames.Repository;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio.LojaDeGames.Model.Produtos;

@Repository
@Transactional
@RestController
@RequestMapping("/dorep")
public interface ProdutoRepository extends JpaRepository <Produtos, Long> {

	public List<Produtos> findAllByDescricaopContainingIgnoreCase(String descricaop);
	
	 @Query(value = "SELECT * FROM tb_produtos WHERE descricaop LIKE CONCAT ('%', ?1,'%') AND nome LIKE CONCAT ('%', ?2, '%')",nativeQuery = true)
	 List<Produtos> pesquisarProdutos(String descricaop, String nome);
	 
	 @Query("FROM Produtos")
	 List<Produtos> nomeProdutos ();
	 
	 @PostMapping("/addprod")
	 @ResponseStatus(value = HttpStatus.CREATED)
	 @Modifying
	 @Query(value = "INSERT INTO tb_produtos (nome, descricaop, preco, categoria_id) VALUES (:nome, :descricaop, :preco, :categoria_id)", nativeQuery = true)
	 void inserirProduto(@Param("nome")String nome, @Param("descricaop")String descricaop, @Param("preco")float preco, @Param("categoria_id")Long categoria_id);
}
