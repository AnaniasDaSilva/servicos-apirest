package com.servicos.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicos.apirest.models.Servico;
import com.servicos.apirest.repository.ServicoRepository;

@RestController
@RequestMapping(value="/api")

public class ServicoResource {
	
	
	@Autowired
	ServicoRepository servicoRepository;
	
	@GetMapping("/servicos")
	public List<Servico> listaServicos(){
		return servicoRepository.findAll();
	}
	
	@GetMapping("/servicos/{id}")
	public Servico listaServicoUnico(@PathVariable(value="id")long id){
		return servicoRepository.findById(id);
	}
	
	@PostMapping("/servico")
	public Servico salvaServico(@RequestBody Servico servico) {
		return servicoRepository.save(servico);
		
	}
	
	@DeleteMapping("/servico")
	public void deletaServico(@RequestBody Servico servico) {
		servicoRepository.delete(servico);
		
	}
	
	@PutMapping("/servico")
	public Servico atualizaServico(@RequestBody Servico servico) {
		return servicoRepository.save(servico);
		
	}
	
}
