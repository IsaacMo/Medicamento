package br.com.medicamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medicamento.domain.ContraIndicacao;
import br.com.medicamento.repository.ContraIndicacaoRepository;

@Service
public class ContraIndicacaoService {
	

	@Autowired
	private ContraIndicacaoRepository repo;
	
	public void save(ContraIndicacao contraIndicacao) {
		repo.save(contraIndicacao);
		
	}
	
	
	public ContraIndicacao findById(Integer id) {
		Optional<ContraIndicacao> ocontraIndicacao = repo.findById(id);
		
		if(!ocontraIndicacao.isPresent()) {
			throw new IllegalArgumentException("Contra Indicação não encontrada: "+ id);
		}
		return ocontraIndicacao.get();
	}
	
	
	public List<ContraIndicacao> findAll(){
		return repo.findAll();
	}

	
	
	
}
