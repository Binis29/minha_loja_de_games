package com.game.loja.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.loja.model.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
	
	public List<CategoriaModel> findAllByTipoContainingIgnoreCase(String tipo);

}
