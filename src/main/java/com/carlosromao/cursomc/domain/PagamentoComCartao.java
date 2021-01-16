package com.carlosromao.cursomc.domain;

import javax.persistence.Entity;

import com.carlosromao.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;

	private Integer numetoDeParcelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.numetoDeParcelas = numeroDeParcelas;
	}

	public Integer getNumetoDeParcelas() {
		return numetoDeParcelas;
	}

	public void setNumetoDeParcelas(Integer numetoDeParcelas) {
		this.numetoDeParcelas = numetoDeParcelas;
	}
	
}
