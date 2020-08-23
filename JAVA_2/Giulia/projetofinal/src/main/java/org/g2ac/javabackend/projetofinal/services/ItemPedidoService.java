package org.g2ac.javabackend.projetofinal.services;

import org.g2ac.javabackend.projetofinal.repositories.PedidoRepositorio;
import org.g2ac.javabackend.projetofinal.repositories.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemPedidoService {

	@Autowired
	private PedidoRepositorio ppRepo;
	private ProdutoRepositorio pdRepo;
	
	
}
