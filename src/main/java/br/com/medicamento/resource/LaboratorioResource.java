package br.com.medicamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.medicamento.domain.Laboratorio;
import br.com.medicamento.service.LaboratorioService;

@RestController
@RequestMapping(value = "/laboratorio")
public class LaboratorioResource {
	
	@Autowired
	private LaboratorioService lService;
	
	
	
	@RequestMapping(value = "{id}")
	public Laboratorio getLaboratorio(@PathVariable Integer id) {
			return lService.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Laboratorio> findAll(){
		
		return lService.findAll();
	}
			
	
	@RequestMapping(method = RequestMethod.POST)
	public void create(@RequestBody Laboratorio laboratorio) {
		lService.save(laboratorio);
		
	}
	
	

}
