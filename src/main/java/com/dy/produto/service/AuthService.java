package com.dy.produto.service;

import org.springframework.beans.factory.annotation.Autowired;	
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dy.produto.repository.UsuarioRepository;
@Service
public class AuthService implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		return repo.findByLongin(username);
	}

}
