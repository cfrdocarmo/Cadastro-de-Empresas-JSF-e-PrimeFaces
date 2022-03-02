package com.cfrdocarmo.erp.model;

public enum TipoEmpresa {

	MEI("Microempreendedor Individual"),
	EIRELI("Empresa Individual de Resposabilidade Limitada"),
	LTDA("Sociedade Limitada"),
	SA("Sociedade Anonima");
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	private TipoEmpresa(String descricao) {
		this.descricao = descricao;
	}
	
	
}
