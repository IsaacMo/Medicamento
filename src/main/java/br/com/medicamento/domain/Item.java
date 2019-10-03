package br.com.medicamento.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Item implements Serializable {

	private static final long serialVersionUID = -7715901876182976108L;

	@JsonIgnore
	@EmbeddedId
	private ItemPK id = new ItemPK();

	private Integer quantidade;

	public ItemPK getId() {
		return id;
	}

	public void setId(ItemPK id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecoUnitario() {
		// return this.quantidade*this.pkItemVenda.getMedicamento();
		return 2.0;
	}

}
