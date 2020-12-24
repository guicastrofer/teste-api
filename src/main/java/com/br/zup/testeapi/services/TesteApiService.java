package com.br.zup.testeapi.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.zup.testeapi.dto.CadastroDTO;
import com.br.zup.testeapi.dto.MensagemResponseDTO;
import com.br.zup.testeapi.repository.TesteApiRepository;

public class TesteApiService {
	
	private TesteApiRepository testeApiRepository;
	
	@Autowired
	public TesteApiService(TesteApiRepository testeApiRepository) {
		this.testeApiRepository = testeApiRepository;
	}
	
	public MensagemResponseDTO create(CadastroDTO cadastroDTO) {
		return new MensagemResponseDTO();
	}

}
