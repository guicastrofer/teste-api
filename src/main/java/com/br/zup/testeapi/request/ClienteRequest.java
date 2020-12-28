package com.br.zup.testeapi.request;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class ClienteRequest {

	
	
	@NotEmpty
	private String nome;
	
	@NotEmpty
	private String email;
	
	@NotEmpty
	private String cpf;
	
	@NotEmpty
	private String dataNascimento;
	
}
