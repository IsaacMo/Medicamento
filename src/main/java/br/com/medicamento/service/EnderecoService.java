package br.com.medicamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medicamento.domain.Endereco;
import br.com.medicamento.repository.EnderecoRepository;

@Service
public class EnderecoService {
		
	@Autowired
	private EnderecoRepository repo;
	
	public void save(Endereco endereco) {
		repo.save(endereco);
		
	}
	
	
	public Endereco findById(Integer id) {
		Optional<Endereco> oendereco = repo.findById(id);
		
		if(!oendereco.isPresent()) {
			throw new IllegalArgumentException("Endereco não encontrado: "+ id);
		}
		return oendereco.get();
	}
	
	
	public List<Endereco> findAll(){
		return repo.findAll();
	}

		
}
