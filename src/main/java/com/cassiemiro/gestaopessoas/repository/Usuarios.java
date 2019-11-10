package com.cassiemiro.gestaopessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cassiemiro.gestaopessoas.model.Usuario;

public interface Usuarios extends JpaRepository<Usuario, Long> {

}
