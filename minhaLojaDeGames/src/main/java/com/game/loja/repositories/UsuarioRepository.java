package com.game.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.loja.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{
	
}
