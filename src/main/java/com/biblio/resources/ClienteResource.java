package com.biblio.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.biblio.biblio.domain.Cliente;
import com.biblio.biblio.services.ClienteServices;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	 
	@Autowired
	private ClienteServices service;
	
		@RequestMapping (value= "/{id}", method=RequestMethod.GET)
		public ResponseEntity<?> find(@PathVariable Integer id) {
			Cliente obj = service.find(id);
			return ResponseEntity.ok().body(obj);
		
		 } 

}
