package br.com.medicamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.medicamento.domain.Uso;
import br.com.medicamento.service.UsoService;

@RestController
@RequestMapping(value = "/uso")
public class UsoResource {

	@Autowired
	private UsoService uService ;

	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody Uso uso) {
		uService.save(uso);
	}

	@RequestMapping(value = "{id}")
	public Uso getUso(@PathVariable Integer id) {
		return uService.findById(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Uso> findAll() {
		return uService.findAll();
	}
	
	@RequestMapping(method =RequestMethod.GET )
	public ResponseEntity<List<Uso>> read(){
		return ResponseEntity.ok().body(uService.read());
	}
	
	
	@RequestMapping(method =RequestMethod.GET, value = "/{id}" )
	public ResponseEntity<Uso> readById(@PathVariable Integer id){
		return ResponseEntity.ok().body(uService.readByIdid());
		
	}

}
