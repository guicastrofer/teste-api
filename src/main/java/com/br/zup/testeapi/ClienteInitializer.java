package com.br.zup.testeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.br.zup.testeapi.entity.Cliente;
import com.br.zup.testeapi.repository.ClienteRepository;
import com.github.javafaker.Faker;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ClienteInitializer implements CommandLineRunner {

  @Autowired
  private ClienteRepository clienteRepository;

  @Override
  public void run(String... args) throws Exception {

    Faker faker = new Faker();

    log.info("Starting book initialization ...");

    for (int i = 0; i < 10; i++) {

      Cliente cliente = new Cliente();
      cliente.setNome(faker.name().firstName());
      cliente.setEmail(faker.internet().emailAddress());
      cliente.setCpf(faker.numerify("1000"));
      cliente.setDataNascimento(faker.date().birthday().toString());

      clienteRepository.save(cliente);
    }

    log.info("... finished book initialization");

  }
}
