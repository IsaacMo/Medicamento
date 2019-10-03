package br.com.medicamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.medicamento.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

	
}
