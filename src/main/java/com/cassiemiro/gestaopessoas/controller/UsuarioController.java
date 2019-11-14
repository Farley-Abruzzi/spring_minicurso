package com.cassiemiro.gestaopessoas.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cassiemiro.gestaopessoas.model.Usuario;
import com.cassiemiro.gestaopessoas.repository.UsuarioDAO;


@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {
	
	@Autowired// Instaciar automaticamente
	private UsuarioDAO usuarioDAO;
	
	@GetMapping("/list")
	public List<Usuario> getUsuarios() {
		return usuarioDAO.findList();
		//Exemplo URL: localhost:8100/usuarios/list
		//Consultando a lista
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> findId(@PathVariable Integer id) {
		
		Usuario usuario = usuarioDAO.findId(id);

		return ResponseEntity.ok().body(usuario);
		//Exemplo URL: localhost:8100/usuarios/1
		//Consulta usuário por id
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> createUsuario(@RequestBody Usuario usuario) {


		System.out.println("\n\n======Classe usuario======");
		System.out.println(usuario);

		usuarioDAO.create(usuario);
		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
		//Exemplo URL: localhost:8100/usuarios
		//Trazendo o usuário criado
	}


	
}
