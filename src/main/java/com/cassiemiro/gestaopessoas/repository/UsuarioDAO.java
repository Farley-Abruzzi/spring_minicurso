package com.cassiemiro.gestaopessoas.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cassiemiro.gestaopessoas.model.Usuario;

@Component
public class UsuarioDAO {

	private static List<Usuario> usuarios;
	{
		usuarios = new ArrayList<Usuario>();

//		long id, String nome, String email, char sexo, String endereco, String telefone, String dataNasc, String cpf
		usuarios.add(new Usuario(1, "Felipe Cassiemiro", "cassiemiro@gmail.com", "m", "Rua dos Desenvolvedores",
				"34991122334", "25/12/2019", "34923423412"));
		usuarios.add(new Usuario(1, "Pedro Henrique Pedrosa", "pedrohenriquepedrosa@gmail.com", "m",
				"Rua dos Desenvolvedores", "34991122334", "25/12/2019", "34923423412"));
	}
	
	public List<Usuario> list() {
		return usuarios;
	}
	public Usuario get(Long id) {
		
		for (Usuario u: usuarios) {
			if (u.getId().equals(id)) {
				return u;
			}
		}
		return null;
		
	}
	public Usuario create(Usuario usuario) {
		usuarios.add(usuario);
		return usuario;
	}
}
