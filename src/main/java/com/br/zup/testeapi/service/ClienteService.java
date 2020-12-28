package com.br.zup.testeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.br.zup.testeapi.entities.Cliente;
import com.br.zup.testeapi.repository.ClienteRepository;
import com.br.zup.testeapi.request.ClienteRequest;
=======
import com.br.zup.testeapi.entity.Cliente;
import com.br.zup.testeapi.repository.ClienteRepository;
>>>>>>> c84e8aedb0180f41ffe8dbf52b672ebf685f838b

@Service
public class ClienteService {
	
<<<<<<< HEAD
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
=======
	private ClienteRepository clienteRepository;
	
	@Autowired
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public void create(Cliente cliente) {
		clienteRepository.save(cliente);
	}

}

>>>>>>> c84e8aedb0180f41ffe8dbf52b672ebf685f838b
