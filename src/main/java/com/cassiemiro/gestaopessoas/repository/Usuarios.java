package com.cassiemiro.gestaopessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.cassiemiro.gestaopessoas.model.Usuario;

@Repository
public interface Usuarios extends JpaRepository<Usuario, Integer> {

    // Consulta para trazer o usuário
    @Query("SELECT obj FROM Usuario obj")
    List<Usuario>findList();

    // Consulta para trazer o usuário por id
    @Query("SELECT obj FROM Usuario obj WHERE obj.id =:id")
    Usuario findId(@Param("id") Integer id);

}
