package com.br.zup.testeapi.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.zup.testeapi.entity.Cliente;
import com.br.zup.testeapi.service.ClienteService;


@RestController
@RequestMapping("/api/v1/cadastro")
public class CadastroController {
	
	
	private ClienteService clienteService;
	
	@Autowired
	public CadastroController (ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
    @PostMapping("/cadastrar")
    public String addUser(@Valid Cliente cliente, BindingResult result) {
        clienteService.create(cliente);
        if (result.hasErrors()) {
        	return "Erro ao cadastrar o cliente";
        }
        return "Cliente adicionado com sucesso";
    }
	

}
