package com.br.zup.testeapi.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.zup.testeapi.dto.CadastroDTO;
import com.br.zup.testeapi.dto.MensagemResponseDTO;
import com.br.zup.testeapi.services.TesteApiService;


@RestController
@RequestMapping("/api/v1/cadastro")
public class TesteApiController {
	
	
	private TesteApiService testeApiService;
	
	@Autowired
	public TesteApiController (TesteApiService testeApiService) {
		this.testeApiService = testeApiService;
	}
	
    @PostMapping
    public MensagemResponseDTO create(@RequestBody @Valid CadastroDTO cadastroDTO){
        return testeApiService.create(cadastroDTO);
    }
	

}
