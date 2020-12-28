package com.br.zup.testeapi.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
