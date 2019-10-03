package br.com.medicamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medicamento.domain.Medicamento;
import br.com.medicamento.repository.MedicamentoRepository;

@Service
public class MedicamentoService {
	

	@Autowired
	private MedicamentoRepository repo;
	
	public void save(Medicamento medicamento) {
		repo.save(medicamento);
		
	}
	
	
	public Medicamento findById(Integer id) {
		Optional<Medicamento> omedicamento = repo.findById(id);
		
		if(!omedicamento.isPresent()) {
			throw new IllegalArgumentException("Medicamento não encontrado: "+ id);
		}
		return omedicamento.get();
	}
	
	
	public List<Medicamento> findAll(){
		return repo.findAll();
	}

	
	
	
}
