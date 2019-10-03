package br.com.medicamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.medicamento.domain.ComposicaoDoMedicamento;
import br.com.medicamento.dto.CompDoMedNewDTO;
import br.com.medicamento.service.ComposicaoDoMedicamentoService;
import br.com.medicamento.service.ComposicaoService;
import br.com.medicamento.service.MedicamentoService;

@RestController
@RequestMapping(value = "/composicaoMedicamento")
public class ComposicaoDoMedicamentoResource {
	
	@Autowired
	private ComposicaoDoMedicamentoService cService;
	
	@Autowired
	private MedicamentoService medService;
	
	@Autowired
	private ComposicaoService compService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody CompDoMedNewDTO dto) {
		ComposicaoDoMedicamento compDoMed = new ComposicaoDoMedicamento();
		compDoMed.setComposicao(compService.findById(dto.getComposicao()));
		compDoMed.setMedicamento(medService.findById(dto.getMedicamento()));
		cService.save(compDoMed);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ComposicaoDoMedicamento getComposicaoDoMedicamento(@PathVariable Integer id) {
		return cService.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<ComposicaoDoMedicamento> findAll(){
		return cService.findAll();
	}
	

}
