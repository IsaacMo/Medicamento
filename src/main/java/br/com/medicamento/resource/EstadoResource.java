package br.com.medicamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.medicamento.domain.Estado;
import br.com.medicamento.service.EstadoService;

@RestController
@RequestMapping(value = "/estado")
public class EstadoResource {
	
	@Autowired
	private EstadoService eService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody Estado estado) {
		eService.save(estado);
	}
	
	@RequestMapping(value = "{id}")
	public Estado getEstado(@PathVariable Integer id) {
		return eService.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Estado> findAll(){
		return eService.findAll();
	}
	

}
