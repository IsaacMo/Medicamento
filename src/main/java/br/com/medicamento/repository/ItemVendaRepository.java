package br.com.medicamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.medicamento.domain.Item;

@Repository
public interface ItemVendaRepository extends JpaRepository<Item, Integer>{

}
