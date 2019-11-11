package com.cassiemiro.gestaopessoas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cassiemiro.gestaopessoas.model.Usuario;
import com.cassiemiro.gestaopessoas.repository.UsuarioDAO;


@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@GetMapping("/usuarios")
	public List<Usuario> getUsuarios() {
		return usuarioDAO.list();
	}
	
	@GetMapping("/usuarios/{id}")
	public ResponseEntity<?> getUsuario(@PathVariable("id")Long id) {
		
		Usuario usuario = usuarioDAO.get(id);
		if (usuario == null) {
			return new ResponseEntity<String>("Nenhum usuário com esse ID foi encontrado" + id,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);	
	}
	
	@PostMapping("/usuarios")
	public ResponseEntity<?> createUsuario(@RequestBody Usuario usuario) {
		usuarioDAO.create(usuario);
		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
	}
}
