package br.com.medicamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medicamento.domain.Estado;
import br.com.medicamento.repository.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repo;
	
	public void save(Estado estado) {
		repo.save(estado);
		
	}
	
	
	public Estado findById(Integer id) {
		Optional<Estado> oestado = repo.findById(id);
		
		if(!oestado.isPresent()) {
			throw new IllegalArgumentException("Estado não encontrado: "+ id);
		}
		return oestado.get();
	}
	
	
	public List<Estado> findAll(){
		return repo.findAll();
	}

}
