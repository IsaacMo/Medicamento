package br.com.medicamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.medicamento.domain.Medicamento;
import br.com.medicamento.dto.MedicamentoDTO;
import br.com.medicamento.service.MedicamentoService;

@RestController
@RequestMapping(value = "/medicamento")
public class MedicamentoResource {

	@Autowired
	private MedicamentoService mService;

	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody MedicamentoDTO dto) {
		
		mService.save(MedicamentoDTO.dtoFromObj(dto));
	}

	@RequestMapping(value = "{id}")
	public Medicamento getMedicamento(@PathVariable Integer id) {
		return mService.findById(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Medicamento> findAll() {
		return mService.findAll();
	}

}
