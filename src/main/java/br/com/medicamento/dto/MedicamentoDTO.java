package br.com.medicamento.dto;

import java.io.Serializable;
import java.util.Date;

import br.com.medicamento.domain.Laboratorio;
import br.com.medicamento.domain.Medicamento;
import br.com.medicamento.domain.Preco;
import br.com.medicamento.domain.enums.EnumModoDeUso;

public class MedicamentoDTO implements Serializable {
	// Atributos do Medicamento
	
	private static final long serialVersionUID = -1147002745461040577L;
	private String cod;
	private String nome;
	private String indicacao;
	private Integer conteudo;
	private Integer enumModoDeUso;
	private String sabor;
	private Date validade;
	private Date fabricacao;

	// Atributos do laboratorio
	private Integer laboratorio;

	// Atributos do preco
	private Integer preco;

	public static Medicamento dtoFromObj(MedicamentoDTO dto) {
		Medicamento medicamento = new Medicamento();
		Laboratorio laboratorio = new Laboratorio();
		Preco preco = new Preco();

		medicamento.setCod(dto.getCod());
		medicamento.setNome(dto.getNome());
		medicamento.setIndicacao(dto.getIndicacao());
		medicamento.setConteudo(dto.getConteudo());
		medicamento.setEnumModoDeUso(dto.getEnumModoDeUso());
		medicamento.setSabor(dto.getSabor());
		medicamento.setValidade(dto.getValidade());
		medicamento.setFabricacao(dto.getFabricacao());
		
		//Laboratorio
		laboratorio.setId(dto.getLaboratorio());
		//Preco
		preco.setId(dto.getPreco());
		
		medicamento.setLaboratorio(laboratorio);
		medicamento.setPreco(preco);
		
		
		
		
		return medicamento;

	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}

	public Integer getConteudo() {
		return conteudo;
	}

	public void setConteudo(Integer conteudo) {
		this.conteudo = conteudo;
	}

	public EnumModoDeUso getEnumModoDeUso() {
		return EnumModoDeUso.toEnum(enumModoDeUso);
	}

	public void setEnumModoDeUso(EnumModoDeUso enumModoDeUso) {
		this.enumModoDeUso = enumModoDeUso.getCod();
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public Date getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(Date fabricacao) {
		this.fabricacao = fabricacao;
	}

	public Integer getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Integer laboratorio) {
		this.laboratorio = laboratorio;
	}

	public Integer getPreco() {
		return preco;
	}

	public void setPreco(Integer preco) {
		this.preco = preco;
	}

	
	

}
