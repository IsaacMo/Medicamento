package br.com.medicamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.medicamento.domain.Preco;

@Repository
public interface PrecoRepository extends JpaRepository<Preco, Integer>{

}
