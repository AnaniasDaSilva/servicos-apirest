package com.servicos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicos.apirest.models.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long> {

	Servico findById(long id);

}
