package br.com.medicamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.medicamento.domain.Uso;

@Repository
public interface UsoRepository extends JpaRepository<Uso, Integer>{

}
