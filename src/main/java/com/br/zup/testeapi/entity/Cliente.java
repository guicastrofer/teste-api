package com.br.zup.testeapi.entity;

import java.sql.Date;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

public class Cliente {
	
	private Long idCliente;
	private String nome;
	private String email;
	private String cpf;
	private String dataNascimento;

}
