	package com.dy.produto.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.dy.produto.entites.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	
	UserDetails findByLongin(String login);

}
	