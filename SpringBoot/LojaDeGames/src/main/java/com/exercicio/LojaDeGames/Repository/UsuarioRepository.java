package com.exercicio.LojaDeGames.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.LojaDeGames.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Optional<Usuario> findByEmail(String email);

	List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
	
	

}
