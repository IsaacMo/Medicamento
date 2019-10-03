package br.com.medicamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.medicamento.domain.ContraIndicacao;
import br.com.medicamento.service.ContraIndicacaoService;

@RestController
@RequestMapping(value = "/contraIndicacao")
public class ContraIndicacaoResource {

	@Autowired
	private ContraIndicacaoService cService ;

	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody ContraIndicacao contraIndicacao) {
		cService.save(contraIndicacao);
	}

	@RequestMapping(value = "{id}")
	public ContraIndicacao getContraIndicacao(@PathVariable Integer id) {
		return cService.findById(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<ContraIndicacao> findAll() {
		return cService.findAll();
	}

}
