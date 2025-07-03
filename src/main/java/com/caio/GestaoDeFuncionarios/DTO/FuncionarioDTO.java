package com.caio.GestaoDeFuncionarios.DTO;

import org.springframework.beans.BeanUtils;

import com.caio.GestaoDeFuncionarios.Entity.FuncionarioEntity;

public class FuncionarioDTO {
	
	private Long id ;
	

	private String nome;
	
	
	private double salario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	public FuncionarioDTO(FuncionarioEntity funcionario) {
		BeanUtils.copyProperties(funcionario, this);
	}
	
	public FuncionarioDTO() {
		
	}
	
}
