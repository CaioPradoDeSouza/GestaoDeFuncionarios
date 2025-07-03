package com.caio.GestaoDeFuncionarios.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.caio.GestaoDeFuncionarios.DTO.FuncionarioDTO;
import com.caio.GestaoDeFuncionarios.Entity.FuncionarioEntity;
import com.caio.GestaoDeFuncionarios.Repository.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public List<FuncionarioDTO> listarTodos(){
		List<FuncionarioEntity> usuarios = funcionarioRepository.findAll();
		return usuarios.stream().map(FuncionarioDTO::new).toList();
	}
	
	public void inserir(FuncionarioDTO funcionario) {
		FuncionarioEntity funcionarioEntity = new FuncionarioEntity(funcionario);
		funcionarioRepository.save(funcionarioEntity);
	}
	
	public FuncionarioDTO alterar(FuncionarioDTO funcionario) {
		FuncionarioEntity funcionarioEntity = new FuncionarioEntity(funcionario);
		funcionarioEntity.setSalario(funcionario.getSalario());
		return new FuncionarioDTO(funcionarioRepository.save(funcionarioEntity));
	}
	
	public void excluir(long id) {
		FuncionarioEntity funcionario = funcionarioRepository.findById(id).get();
		funcionarioRepository.delete(funcionario);
	}
	
}
