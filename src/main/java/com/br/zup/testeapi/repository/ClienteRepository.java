package com.br.zup.testeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.zup.testeapi.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
