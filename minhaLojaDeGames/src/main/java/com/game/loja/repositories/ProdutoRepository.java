package com.game.loja.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.loja.model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
	
	public List<ProdutoModel> findAllByNomeContainingIgnoreCase(String nome);

}
