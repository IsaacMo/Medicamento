package br.com.medicamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.medicamento.domain.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer>{

}