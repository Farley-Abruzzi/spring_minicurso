package com.cassiemiro.gestaopessoas.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String sexo;
	private String endereco;
	private String telefone;
	private String dataNasc;
	private String cpf;

	public Usuario(){
	}

	public Usuario(Integer id, String nome, String email, String sexo, String endereco, String telefone, String dataNasc,
			String cpf) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Usuario [cpf=" + cpf + ", dataNasc=" + dataNasc + ", email=" + email + ", endereco=" + endereco
				+ ", id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", telefone=" + telefone + "]";
	}

	

}
