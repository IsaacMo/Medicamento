package br.com.medicamento.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.medicamento.domain.enums.EnumModoDeUso;

@Entity
public class Medicamento implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String cod;
	private String nome;
	private String indicacao;
	private Integer conteudo;
	private String sabor;
	@Temporal(TemporalType.DATE)
	private Date validade;
	@Temporal(TemporalType.DATE)
	private Date fabricacao;

	private Integer enumModoDeUso;

	// Relacionamento com Laboratorio
	@ManyToOne
	@JoinColumn(name = "laboratorio_id")
	private Laboratorio laboratorio;

	// Relacionamento com Uso
	@ManyToMany(mappedBy = "medicamentos")
	private List<Uso> usos;

	// Relacionamento com preco
	@OneToOne
	@JoinColumn(name = "preco_id")
	private Preco preco;

	// Relacionamento com dose
	@OneToMany(mappedBy = "medicamento")
	private List<Dose> doses;

	// Relacionamento com Contra Indicação
	@OneToMany(mappedBy = "medicamento")
	private List<ContraIndicacao> contraIndicacoes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public EnumModoDeUso getEnumModoDeUso() {
		return EnumModoDeUso.toEnum(enumModoDeUso);
	}

	public void setEnumModoDeUso(EnumModoDeUso enumModoDeUso) {
		this.enumModoDeUso = enumModoDeUso.getCod();
	}

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	public Double getPrecoAtual() {
		return this.preco.getValor();
	}

	public List<Uso> getUsos() {
		return usos;
	}

	public void setUsos(List<Uso> usos) {
		this.usos = usos;
	}

	public Preco getPreco() {
		return preco;
	}

	public void setPreco(Preco preco) {
		this.preco = preco;
	}

	public List<Dose> getDoses() {
		return doses;
	}

	public void setDoses(List<Dose> doses) {
		this.doses = doses;
	}

	public List<ContraIndicacao> getContraIndicacoes() {
		return contraIndicacoes;
	}

	public void setContraIndicacoes(List<ContraIndicacao> contraIndicacoes) {
		this.contraIndicacoes = contraIndicacoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Medicamento other = (Medicamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
