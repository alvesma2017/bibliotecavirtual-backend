package com.biblio.biblio.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblio.biblio.domain.Categoria;
import com.biblio.biblio.repositories.CategoriaRepository;
import com.biblio.biblio.services.exceptions.ObjectNotFoundException;


@Service
public class CategoriaServices {
	

	@Autowired
	private CategoriaRepository repo;
	

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		
		
	}
		
		
	}

