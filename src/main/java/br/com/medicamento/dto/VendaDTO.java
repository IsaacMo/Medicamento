package br.com.medicamento.dto;

import java.io.Serializable;

import br.com.medicamento.domain.Cliente;
import br.com.medicamento.domain.Venda;
import br.com.medicamento.domain.enums.EnumEstadoPagamento;

public class VendaDTO implements Serializable{

	private static final long serialVersionUID = 987290591992780026L;
	
	private Integer enumEstadoPagamento;
	
	private Integer cliente;
	
	
	public static Venda dtoFromObj(VendaDTO dto) {
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		venda.setEnumEstadoPagamento(dto.getEnumEstadoPagamento());
		
		
		cliente.setId(dto.getCliente());
		
		venda.setCliente(cliente);
		
		return venda;
	}


	public EnumEstadoPagamento getEnumEstadoPagamento() {
		return EnumEstadoPagamento.toEnum(enumEstadoPagamento);
	}


	public void setEnumEstadoPagamento(EnumEstadoPagamento enumEstadoPagamento) {
		this.enumEstadoPagamento = enumEstadoPagamento.getCod();
	}


	public Integer getCliente() {
		return cliente;
	}


	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((enumEstadoPagamento == null) ? 0 : enumEstadoPagamento.hashCode());
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
		VendaDTO other = (VendaDTO) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (enumEstadoPagamento == null) {
			if (other.enumEstadoPagamento != null)
				return false;
		} else if (!enumEstadoPagamento.equals(other.enumEstadoPagamento))
			return false;
		return true;
	}
	
	
	
	
	

}
