package br.com.medicamento.domain.enums;

public enum EnumModoDeUso {
	ORAL(1,"Ministrado via Oral"),
	SUBLINGUAL(2,"Ministrado via Sublingual"),
	ENDOVENOSA(3,"Ministrado via endovenosa");
	
	private Integer cod;
	private String descricao;
	
	private EnumModoDeUso(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	
	
	public Integer getCod() {
		return cod;
	}


	public String getDescricao() {
		return descricao;
	}



	public static EnumModoDeUso toEnum(Integer cod) {
		if(cod == null	) {
			return null; 
		}else {
			for(EnumModoDeUso x : EnumModoDeUso.values()) {
				if(x.equals(x.getCod())) {
					return x;
				}
			}
		}throw new IllegalArgumentException("ID inválido: "+cod);
	}
	
	
}
