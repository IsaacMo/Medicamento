package br.com.medicamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.medicamento.domain.Composicao;
import br.com.medicamento.service.ComposicaoService;

@RestController
@RequestMapping(value = "/composicao")
public class ComposicaoResource {

	@Autowired
	private ComposicaoService cService ;

	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody Composicao composicao) {
		cService.save(composicao);
	}

	@RequestMapping(value = "{id}")
	public Composicao getComposicao(@PathVariable Integer id) {
		return cService.findById(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Composicao> findAll() {
		return cService.findAll();
	}

}
