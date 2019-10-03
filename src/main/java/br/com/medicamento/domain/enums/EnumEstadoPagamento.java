package br.com.medicamento.domain.enums;

public enum EnumEstadoPagamento {
	PAGO(1,"Pago"),
	AGUARDANDO_PAGAMENTO(2,"Aguardando Pagamento");
	
	
	private Integer cod;
	private String descricao;
	
	private EnumEstadoPagamento(Integer cod, String descricao) {
		this.cod= cod;
		this.descricao = descricao;
	}

	public Integer getCod() {
		return cod;
	}


	public String getDescricao() {
		return descricao;
	}

	
	public static EnumEstadoPagamento toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}else {
			for(EnumEstadoPagamento p : EnumEstadoPagamento.values()) {
				if(p.equals(p.getCod())) {
					return p;
				}
			}
		}throw new IllegalArgumentException("ID inválido: "+cod);
	}
	
	
}
