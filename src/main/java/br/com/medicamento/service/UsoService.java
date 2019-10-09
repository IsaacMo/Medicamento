package br.com.medicamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medicamento.domain.Uso;
import br.com.medicamento.repository.UsoRepository;

@Service
public class UsoService {
	

	@Autowired
	private UsoRepository repo;
	
	public void save(Uso uso) {
		repo.save(uso);
		
	}
	
	
	public Uso findById(Integer id) {
		Optional<Uso> ouso = repo.findById(id);
		
		if(!ouso.isPresent()) {
			throw new IllegalArgumentException("Uso não encontrado: "+ id);
		}
		return ouso.get();
	}
	
	
	public List<Uso> findAll(){
		return repo.findAll();
	}

	
	
	
}
