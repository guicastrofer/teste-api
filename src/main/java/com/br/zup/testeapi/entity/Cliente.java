package com.br.zup.testeapi.entity;

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
<<<<<<< HEAD:src/main/java/com/br/zup/testeapi/entities/Cliente.java
	
=======
>>>>>>> c84e8aedb0180f41ffe8dbf52b672ebf685f838b:src/main/java/com/br/zup/testeapi/entity/Cliente.java
	private String dataNascimento;

}
