package com.itb.tcc.uniaovoluntaria.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-Incremento de 1 em 1
	private Long id;
	
	private String nome;
	private String email;
	private String cpf;
	private LocalDate dataDeNasci;
	private String senha;
	private String status;
	
	//Getters e Setters 
	
	//Id
	
	public String isStatus() {
		return status;
	}

	public void setStatus(String string) {
		this.status = string;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	//Nome
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Email
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Cpf
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	//Data de nascimento 
	
	public LocalDate getDataDeNasci() {
		return dataDeNasci;
	}
	
	public void setDataDeNasci(LocalDate dataDeNasci) {
		this.dataDeNasci = dataDeNasci;
	}
	
	
	//Senha 
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setStatus(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	
}
