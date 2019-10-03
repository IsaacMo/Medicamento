package br.com.medicamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medicamento.domain.Dose;
import br.com.medicamento.repository.DoseRepository;

@Service
public class DoseService {
	

	@Autowired
	private DoseRepository repo;
	
	public void save(Dose dose) {
		repo.save(dose);
		
	}
	
	
	public Dose findById(Integer id) {
		Optional<Dose> odose = repo.findById(id);
		
		if(!odose.isPresent()) {
			throw new IllegalArgumentException("Dose não encontrada: "+ id);
		}
		return odose.get();
	}
	
	
	public List<Dose> findAll(){
		return repo.findAll();
	}

	
	
	
}
