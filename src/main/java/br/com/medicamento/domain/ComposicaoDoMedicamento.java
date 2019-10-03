package br.com.medicamento.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ComposicaoDoMedicamento implements Serializable{
	
	private static final long serialVersionUID = 5919354581541570008L;
	@JsonIgnore
	@EmbeddedId
	private ComposicaoDoMedicamentoPK id = new ComposicaoDoMedicamentoPK();
	
	private Integer qtd;

	private String nome;
	
	

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public ComposicaoDoMedicamentoPK getId() {
		return id;
	}

	public void setId(ComposicaoDoMedicamentoPK id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
