package com.exercicio.LojaDeGames.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercicio.LojaDeGames.Model.Produtos;

@Repository
public interface ProdutoRepository extends JpaRepository <Produtos, Long> {

	public List<Produtos> findAllByDescricaopContainingIgnoreCase(String descricaop);

}
