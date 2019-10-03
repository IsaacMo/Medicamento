package br.com.medicamento.dto;

import java.io.Serializable;

import br.com.medicamento.domain.Composicao;
import br.com.medicamento.domain.ComposicaoDoMedicamento;
import br.com.medicamento.domain.Medicamento;

public class CompDoMedNewDTO implements Serializable {

	private static final long serialVersionUID = -7415236546696742248L;

	private Integer qtd;
	private Integer medicamento;
	private Integer composicao;

	public static ComposicaoDoMedicamento dtoFromObj(CompDoMedNewDTO dto) {
		ComposicaoDoMedicamento compDoMed = new ComposicaoDoMedicamento();
		Composicao composicao = new Composicao();
		Medicamento medicamento = new Medicamento();
		
		
		compDoMed.setQtd(dto.getQtd());
		
		composicao.setId(dto.getComposicao());
		medicamento.setId(dto.getMedicamento());
		
		compDoMed.setComposicao(composicao);
		compDoMed.setMedicamento(medicamento);
		
		return compDoMed;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public Integer getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Integer medicamento) {
		this.medicamento = medicamento;
	}

	public Integer getComposicao() {
		return composicao;
	}

	public void setComposicao(Integer composicao) {
		this.composicao = composicao;
	}

	
	
	
}
