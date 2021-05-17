package com.exemplo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.demo.domain.Usuario;
import com.exemplo.demo.repository.UsuarioRepository;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
	UsuarioRepository repositorio;

	@CrossOrigin
	@GetMapping
	public List<Usuario> todos() {
		return repositorio.findAll();
	}
	
	@CrossOrigin
	@PostMapping
	public Usuario novo(@RequestBody Usuario usuario) {
		return repositorio.save(usuario);
	}
	
}
