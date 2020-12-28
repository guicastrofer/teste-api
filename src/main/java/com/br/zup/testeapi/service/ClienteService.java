package com.br.zup.testeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.zup.testeapi.entities.Cliente;
import com.br.zup.testeapi.repository.ClienteRepository;
import com.br.zup.testeapi.request.ClienteRequest;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	

	  public Long cadastroNovoCliente(ClienteRequest clienteRequest) {
	    Cliente cliente = new Cliente();
	    cliente.setCpf(clienteRequest.getCpf());
	    cliente.setNome(clienteRequest.getNome());
		cliente.setDataNascimento(clienteRequest.getDataNascimento()); 
	    cliente.setEmail(clienteRequest.getEmail());


	    cliente = clienteRepository.save(cliente);

	    return cliente.getIdCliente();
	  }
}
