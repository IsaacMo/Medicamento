package br.com.medicamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.medicamento.domain.Venda;
import br.com.medicamento.dto.VendaDTO;
import br.com.medicamento.service.VendaService;

@RestController
@RequestMapping(value = "/venda")
public class VendaResource {

	@Autowired
	private VendaService vService ;

	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody VendaDTO dto) {
		vService.save(VendaDTO.dtoFromObj(dto));
	}

	@RequestMapping(value = "{id}")
	public Venda getoVenda(@PathVariable Integer id) {
		return vService.findById(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Venda> findAll() {
		return vService.findAll();
	}

}
