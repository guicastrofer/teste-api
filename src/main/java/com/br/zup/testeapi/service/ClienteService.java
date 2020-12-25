package com.br.zup.testeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.zup.testeapi.entity.Cliente;
import com.br.zup.testeapi.repository.ClienteRepository;

@Service
public class ClienteService {
	
	private ClienteRepository clienteRepository;
	
	@Autowired
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public void create(Cliente cliente) {
		clienteRepository.save(cliente);
	}

}

