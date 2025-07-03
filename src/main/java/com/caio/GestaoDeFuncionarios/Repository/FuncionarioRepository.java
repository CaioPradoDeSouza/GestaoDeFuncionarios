package com.caio.GestaoDeFuncionarios.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.GestaoDeFuncionarios.Entity.FuncionarioEntity;

public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity,   Long> {
	
}
