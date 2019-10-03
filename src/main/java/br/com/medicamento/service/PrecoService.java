package br.com.medicamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medicamento.domain.Preco;
import br.com.medicamento.repository.PrecoRepository;

@Service
public class PrecoService {
	

	@Autowired
	private PrecoRepository repo;
	
	public void save(Preco preco) {
		repo.save(preco);
		
	}
	
	
	public Preco findById(Integer id) {
		Optional<Preco> opreco = repo.findById(id);
		
		if(!opreco.isPresent()) {
			throw new IllegalArgumentException("Preco não encontrado: "+ id);
		}
		return opreco.get();
	}
	
	
	public List<Preco> findAll(){
		return repo.findAll();
	}

	
	
	
}
