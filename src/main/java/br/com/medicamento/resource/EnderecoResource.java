package br.com.medicamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.medicamento.domain.Endereco;
import br.com.medicamento.service.EnderecoService;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoResource {

	@Autowired
	private EnderecoService eService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody Endereco endereco) {
		eService.save(endereco);
	}

	@RequestMapping(value = "{id}")
	public Endereco getContraIndicacao(@PathVariable Integer id) {
		return eService.findById(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Endereco> findAll() {
		return eService.findAll();
	}
	
	
}
