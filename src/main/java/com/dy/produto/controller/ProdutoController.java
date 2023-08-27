package com.dy.produto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dy.produto.entites.Produto;
import com.dy.produto.repository.ProdutoRepository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@RestController
@Setter
@AllArgsConstructor
@RequestMapping(value="api/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoRepository repo;
	
	
	@GetMapping
	public List<Produto> produtos (){
		List<Produto> resposta = repo.findAll();
		return resposta;
	}
	
	@GetMapping(value="/{id}")
	public Produto produtosId(@PathVariable Integer id){
		Produto resposta = repo.findById(id).get();
		return resposta;
	}
	@PostMapping
	public Produto addProduto(@RequestBody Produto produto){
		Produto resposta = repo.save(produto);
		return resposta;
		}
	@DeleteMapping(value="/{id}")
	public void delProduto(@PathVariable Integer id){
		repo.deleteById(id);
		
		}
	
	@PutMapping
	public Produto atualizarProduto(@RequestBody Produto produto){
		Produto resposta = repo.save(produto);
		return resposta;
		}

}
