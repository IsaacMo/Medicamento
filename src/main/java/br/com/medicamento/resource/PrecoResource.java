package br.com.medicamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.medicamento.domain.Preco;
import br.com.medicamento.service.PrecoService;

@RestController
@RequestMapping(value = "/preco")
public class PrecoResource {

	@Autowired
	private PrecoService pService ;

	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody Preco preco) {
		pService.save(preco);
	}

	@RequestMapping(value = "{id}")
	public Preco getPreco(@PathVariable Integer id) {
		return pService.findById(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Preco> findAll() {
		return pService.findAll();
	}

}
