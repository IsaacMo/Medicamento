package br.com.medicamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.medicamento.domain.ContraIndicacao;

@Repository
public interface ContraIndicacaoRepository extends JpaRepository<ContraIndicacao, Integer>{

}
