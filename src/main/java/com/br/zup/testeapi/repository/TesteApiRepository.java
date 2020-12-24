package com.br.zup.testeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.zup.testeapi.entities.Cliente;

public interface TesteApiRepository extends JpaRepository<Cliente,Long> {

}
