package com.cassiemiro.gestaopessoas.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cassiemiro.gestaopessoas.model.Usuario;

@Service
@Component
public class UsuarioDAO {

	@Autowired// Instanciar automaticamente
	private Usuarios repository;

	
	private static List<Usuario> usuarios;
	{
		usuarios = new ArrayList<Usuario>();

//		Integer id, String nome, String email, char sexo, String endereco, String telefone, String dataNasc, String cpf
		usuarios.add(new Usuario(1, "Felipe Cassiemiro", "cassiemiro@gmail.com", "m", "Rua dos Desenvolvedores",
				"34991122334", "25/12/2019", "34923423412"));
		usuarios.add(new Usuario(2, "Pedro Henrique Pedrosa", "pedrohenriquepedrosa@gmail.com", "m",
				"Rua dos Desenvolvedores", "34991122334", "25/12/2019", "34923423412"));
	}

	
	
	public List<Usuario> findList() {
		//return usuarios;

		List<Usuario> listAll = repository.findList();
		return listAll;

	}
	
	public Usuario findId(Integer id) {
		
		/*for (Usuario u: usuarios) {
			if (u.getId().equals(id)) {
				return u;
			}
		}*/

		return repository.findId(id);
		
	}
	public Usuario create(Usuario usuario) {
		repository.save(usuario);
		return usuario;
	}
}
