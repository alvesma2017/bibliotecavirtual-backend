package com.biblio.biblio.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.biblio.biblio.domain.Pedido;

import com.biblio.biblio.repositories.PedidoRepository;
import com.biblio.biblio.services.exceptions.ObjectNotFoundException;


@Service
public class PedidoServices {
	

	@Autowired
	private PedidoRepository repo;
	

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
		
		
	}
		
		
	}

