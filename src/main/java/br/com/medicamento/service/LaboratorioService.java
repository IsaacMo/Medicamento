package br.com.medicamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medicamento.domain.Laboratorio;
import br.com.medicamento.repository.LaboratorioRepository;

@Service
public class LaboratorioService {
	

	@Autowired
	private LaboratorioRepository repo;
	
	public void save(Laboratorio laboratorio) {
		repo.save(laboratorio);
		
	}
	
	
	public Laboratorio findById(Integer id) {
		Optional<Laboratorio> olaboratorio = repo.findById(id);
		
		if(!olaboratorio.isPresent()) {
			throw new IllegalArgumentException("Laboratorio não encontrado: "+ id);
		}
		return olaboratorio.get();
	}
	
	
	public List<Laboratorio> findAll(){
		return repo.findAll();
	}
	


	
	
	
}
