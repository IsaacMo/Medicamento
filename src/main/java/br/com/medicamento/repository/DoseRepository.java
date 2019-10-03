package br.com.medicamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.medicamento.domain.Dose;

@Repository
public interface DoseRepository extends JpaRepository<Dose, Integer>{

}
