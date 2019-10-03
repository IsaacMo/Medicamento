package br.com.medicamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medicamento.domain.ComposicaoDoMedicamento;
import br.com.medicamento.repository.ComposicaoDoMedicamentoRepository;

@Service
public class ComposicaoDoMedicamentoService {
	

	@Autowired
	private ComposicaoDoMedicamentoRepository repo;
	
	public void save(ComposicaoDoMedicamento composicaoDoMedicamento) {
		repo.save(composicaoDoMedicamento);
	}
	
	
	public ComposicaoDoMedicamento findById(Integer id) {
		Optional<ComposicaoDoMedicamento> ocomposicaoDoMedicamento = repo.findById(id);
		
		if(!ocomposicaoDoMedicamento.isPresent()) {
			throw new IllegalArgumentException("Composição do Medicamento não encontrada: "+ id);
		}
		return ocomposicaoDoMedicamento.get();
	}
	
	
	public List<ComposicaoDoMedicamento> findAll(){
		return repo.findAll();
	}
	


	
	
	
}
