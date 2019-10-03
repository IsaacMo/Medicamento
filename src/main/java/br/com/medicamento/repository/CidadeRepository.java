package br.com.medicamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.medicamento.domain.Cidade;
import br.com.medicamento.domain.Estado;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
	List<Cidade> findByEstado(Estado estado);

}
