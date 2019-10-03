package br.com.medicamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.medicamento.domain.Cliente;
import br.com.medicamento.service.ClienteService;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteResource {

	@Autowired
	private ClienteService cService ;

	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody Cliente cliente) {
		cService.save(cliente);
	}

	@RequestMapping(value = "{id}")
	public Cliente getCliente(@PathVariable Integer id) {
		return cService.findById(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Cliente> findAll() {
		return cService.findAll();
	}

}
