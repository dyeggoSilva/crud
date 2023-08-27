package com.dy.produto.controller;

import java.io.ObjectInputFilter.Config;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dy.produto.dto.Login;
import com.dy.produto.entites.Produto;
import com.dy.produto.entites.Usuario;
import com.dy.produto.repository.UsuarioRepository;



public class AuthController {
	
	
	
	//@Autowired
	/*private TokenService tokenService;
	
	
	@PostMapping("api/authenticate")
	public String login(@RequestBody Login login){
		UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = 
				new UsernamePasswordAuthenticationToken(login.login(), login.password());
		
	Authentication authenticate = this.authenticationManager.authenticate(usernamePasswordAuthenticationToken);
		var usuario = (Usuario)authenticate.getPrincipal();
		return tokenService.gerarToken(usuario);

		}*/
	
	
}
