package br.com.medicamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medicamento.domain.Cliente;
import br.com.medicamento.repository.ClienteRepository;

@Service
public class ClienteService {
	

	@Autowired
	private ClienteRepository repo;
	
	public void save(Cliente cliente) {
		repo.save(cliente);
		
	}
	
	
	public Cliente findById(Integer id) {
		Optional<Cliente> ocliente = repo.findById(id);
		
		if(!ocliente.isPresent()) {
			throw new IllegalArgumentException("Cliente não encontrado: "+ id);
		}
		return ocliente.get();
	}
	
	
	public List<Cliente> findAll(){
		return repo.findAll();
	}

	
	
	
}
