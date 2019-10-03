package br.com.medicamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.medicamento.domain.Composicao;

@Repository
public interface ComposicaoRepository extends JpaRepository<Composicao, Integer>{

}
