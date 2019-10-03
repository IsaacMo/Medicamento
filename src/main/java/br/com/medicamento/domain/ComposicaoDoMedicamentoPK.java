package br.com.medicamento.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ComposicaoDoMedicamentoPK implements Serializable{
	
	
	private static final long serialVersionUID = 7119544656738989494L;


	@ManyToOne
	@JoinColumn(name = "composicao_id")
	private Composicao composicao;
	
	
	@ManyToOne
	@JoinColumn(name = "medicamento_id")
	private Medicamento medicamento;


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((composicao == null) ? 0 : composicao.hashCode());
		result = prime * result + ((medicamento == null) ? 0 : medicamento.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComposicaoDoMedicamentoPK other = (ComposicaoDoMedicamentoPK) obj;
		if (composicao == null) {
			if (other.composicao != null)
				return false;
		} else if (!composicao.equals(other.composicao))
			return false;
		if (medicamento == null) {
			if (other.medicamento != null)
				return false;
		} else if (!medicamento.equals(other.medicamento))
			return false;
		return true;
	}


	public Composicao getComposicao() {
		return composicao;
	}


	public void setComposicao(Composicao composicao) {
		this.composicao = composicao;
	}


	public Medicamento getMedicamento() {
		return medicamento;
	}


	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	
	
	
	
	

}
