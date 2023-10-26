package com.GerenciamentoPedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GerenciamentoPedidos.entities.Pedido;

	public interface PedidoRepository  extends JpaRepository<Pedido, Long> {

	}
