package br.com.medicamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.medicamento.domain.Dose;
import br.com.medicamento.service.DoseService;

@RestController
@RequestMapping(value = "/dose")
public class DoseResource {

	@Autowired
	private DoseService dService ;

	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody Dose dose) {
		dService.save(dose);
	}

	@RequestMapping(value = "{id}")
	public Dose getPreco(@PathVariable Integer id) {
		return dService.findById(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Dose> findAll() {
		return dService.findAll();
	}

}
