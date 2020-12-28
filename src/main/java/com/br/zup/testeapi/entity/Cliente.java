package com.br.zup.testeapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public class Cliente {
	@Id
	@GeneratedValue
	private Long idCliente;
	private String nome;
	private String email;
	private String cpf;
	private String dataNascimento;

}
