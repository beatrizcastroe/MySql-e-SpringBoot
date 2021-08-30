package com.exercicio.LojaDeGames.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercicio.LojaDeGames.Model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Long> {
	
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);

}
