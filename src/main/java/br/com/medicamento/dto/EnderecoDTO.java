package br.com.medicamento.dto;

import java.io.Serializable;

import br.com.medicamento.domain.Cidade;
import br.com.medicamento.domain.Cliente;
import br.com.medicamento.domain.Endereco;
import br.com.medicamento.domain.Laboratorio;
import br.com.medicamento.domain.Venda;

public class EnderecoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//Atributos de Endereço
	private String rua;
	private String complemento;
	private String bairro;
	private String cep;
	
	//Atributos do Laboratório
	private Integer laboratorio;
	
	//Atributos do Cliente
	private Integer cliente;
	//Cidade
	private Integer cidade;
	
	//Venda
	private Integer venda;

	
	public static Endereco dtoFromObj(EnderecoDTO dto) {
		Cidade cidade  = new Cidade();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Laboratorio  laboratorio = new Laboratorio();
		Endereco endereco = new Endereco();
		
		endereco.setRua(dto.getRua());
		endereco.setComplemento(dto.getComplemento());
		endereco.setBairro(dto.getBairro());
		endereco.setCep(dto.getCep());
		
		
		//Laboratorio
		laboratorio.setId(dto.getLaboratorio());
		
		cidade.setId(dto.getCidade());
		venda.setId(dto.getVenda());
		cliente.setId(dto.getCliente());
		
		endereco.setCidade(cidade);
		endereco.setLaboratorio(laboratorio);
		endereco.setVenda(venda);
		endereco.setCliente(cliente);
		
		return endereco;
		
		
	}


	
	
	//Getters and Setters 
	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public Integer getLaboratorio() {
		return laboratorio;
	}


	public void setLaboratorio(Integer laboratorio) {
		this.laboratorio = laboratorio;
	}


	public Integer getCliente() {
		return cliente;
	}


	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}


	public Integer getCidade() {
		return cidade;
	}


	public void setCidade(Integer cidade) {
		this.cidade = cidade;
	}


	public Integer getVenda() {
		return venda;
	}


	public void setVenda(Integer venda) {
		this.venda = venda;
	}
	
	
	
	
	
	
	
	
}
