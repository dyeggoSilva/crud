package com.dy.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dy.produto.entites.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
