package br.com.medicamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medicamento.domain.Composicao;
import br.com.medicamento.repository.ComposicaoRepository;

@Service
public class ComposicaoService {
	

	@Autowired
	private ComposicaoRepository repo;
	
	public void save(Composicao composicao) {
		repo.save(composicao);
		
	}
	
	
	public Composicao findById(Integer id) {
		Optional<Composicao> ocomposicao = repo.findById(id);
		
		if(!ocomposicao.isPresent()) {
			throw new IllegalArgumentException("Composição não encontrada: "+ id);
		}
		return ocomposicao.get();
	}
	
	
	public List<Composicao> findAll(){
		return repo.findAll();
	}

	
	
	
}
