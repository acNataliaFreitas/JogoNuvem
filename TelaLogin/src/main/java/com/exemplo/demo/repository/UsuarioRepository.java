package com.exemplo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.demo.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
