package br.com.medicamento.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Venda implements Serializable {

	private static final long serialVersionUID = 5473091529686058623L;

	@Id
	@GeneratedValue()
	private Integer id;
	private Integer enumEstadoPagamento;

	@OneToOne(mappedBy = "laboratorio", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Endereco enderecoDeEntrega;

	
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEnumEstadoPagamento() {
		return enumEstadoPagamento;
	}

	public void setEnumEstadoPagamento(Integer enumEstadoPagamento) {
		this.enumEstadoPagamento = enumEstadoPagamento;
	}



	public Endereco getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}

	public void setEnderecoDeEntrega(Endereco enderecoDeEntrega) {
		this.enderecoDeEntrega = enderecoDeEntrega;
	}


}
