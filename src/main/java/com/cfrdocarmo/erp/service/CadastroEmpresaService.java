package com.cfrdocarmo.erp.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.cfrdocarmo.erp.model.Empresa;
import com.cfrdocarmo.erp.repository.Empresas;
import com.cfrdocarmo.erp.util.Transacional;

public class CadastroEmpresaService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Empresas empresas;
	
	@Transacional
	public void salvar(Empresa empresa) {
		empresas.guardar(empresa);
	}
	
	@Transacional
	public void excluir(Empresa empresa) {
		empresas.remover(empresa);
	}

}