package com.br.zup.testeapi.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.br.zup.testeapi.request.ClienteRequest;
import com.br.zup.testeapi.service.ClienteService;


@RestController
@RequestMapping("/api/v1/cadastro")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	  @PostMapping
	  public ResponseEntity<Void> cadastrarNovoCliente(@Valid @RequestBody ClienteRequest clienteRequest, UriComponentsBuilder uriComponentsBuilder) {
	    Long primaryKey = clienteService.cadastroNovoCliente(clienteRequest);

	    UriComponents uriComponents = uriComponentsBuilder.path("/api/v1/cadastro/{id}").buildAndExpand(primaryKey);
	    HttpHeaders headers = new HttpHeaders();
	    headers.setLocation(uriComponents.toUri());

	    return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	  }
	 
	

}
