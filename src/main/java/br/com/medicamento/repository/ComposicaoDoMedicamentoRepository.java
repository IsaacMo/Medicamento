package br.com.medicamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.medicamento.domain.ComposicaoDoMedicamento;

public interface ComposicaoDoMedicamentoRepository  extends JpaRepository<ComposicaoDoMedicamento, Integer>{

}
