package com.caio.GestaoDeFuncionarios.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caio.GestaoDeFuncionarios.DTO.FuncionarioDTO;
import com.caio.GestaoDeFuncionarios.Service.FuncionarioService;

@RestController
@RequestMapping(value="/funcionario")
@CrossOrigin
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@GetMapping
	public List<FuncionarioDTO> listarTodos(){
		return funcionarioService.listarTodos();
	}
	
	@PostMapping
	public void inserir(@RequestBody FuncionarioDTO funcionario) {
		funcionarioService.inserir(funcionario);
	}
	
	@PutMapping
	public FuncionarioDTO alterar(@RequestBody FuncionarioDTO funcionario) {
		return funcionarioService.alterar(funcionario);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
		funcionarioService.excluir(id);
		return ResponseEntity.ok().build();
	}
}
