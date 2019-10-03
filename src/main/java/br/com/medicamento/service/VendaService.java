package br.com.medicamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medicamento.domain.Venda;
import br.com.medicamento.repository.VendaRepository;

@Service
public class VendaService {
	

	@Autowired
	private VendaRepository repo;
	
	public void save(Venda venda) {
		repo.save(venda);
		
	}
	
	
	public Venda findById(Integer id) {
		Optional<Venda> ovenda = repo.findById(id);
		
		if(!ovenda.isPresent()) {
			throw new IllegalArgumentException("Venda não encontrado: "+ id);
		}
		return ovenda.get();
	}
	
	
	public List<Venda> findAll(){
		return repo.findAll();
	}

	
	
	
}
