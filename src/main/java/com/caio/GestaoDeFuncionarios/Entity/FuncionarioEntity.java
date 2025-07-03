package com.caio.GestaoDeFuncionarios.Entity;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.caio.GestaoDeFuncionarios.DTO.FuncionarioDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CPS_FUNCIONARIO")
public class FuncionarioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	@Column(nullable=false)
	private String nome;
	
	@Column(nullable=false)
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FuncionarioEntity other = (FuncionarioEntity) obj;
		return Objects.equals(id, other.id);
	}
	
	public FuncionarioEntity(FuncionarioDTO funcionario) {
		BeanUtils.copyProperties(funcionario, this);
	}
	
	public FuncionarioEntity() {
		
	}
	
}
