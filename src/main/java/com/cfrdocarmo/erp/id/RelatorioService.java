package com.cfrdocarmo.erp.id;

import java.math.BigDecimal;

import javax.inject.Inject;

public class RelatorioService {

	@Inject
	private Pedidos pedidos;
	
	
	
	public RelatorioService() {
	}



	public BigDecimal totalPedidosMEsAtual() {
		return pedidos.totalPedidosMesAtual();
	}
	
	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}
}
