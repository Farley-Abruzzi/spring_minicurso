package com.cassiemiro.gestaopessoas.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cassiemiro.gestaopessoas.model.Usuario;
import com.cassiemiro.gestaopessoas.repository.Usuarios;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class UsuarioController {
	@Autowired
	static private Usuarios usuarios;

	@GetMapping(value = "/usuarios", produces = "application/json")
	public @ResponseBody void getUsuarios() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("./newUser.json"), usuarios);
	}

	@RequestMapping(value = "/usuarios", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public @ResponseBody Usuario postUsuario(@RequestBody Usuario novoUsuario) {
		System.out.println("Creating a new User: " + novoUsuario.getNome());
		return novoUsuario;
	}
}
