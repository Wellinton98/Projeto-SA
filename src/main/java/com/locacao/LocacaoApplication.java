package com.locacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LocacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocacaoApplication.class, args);
		System.out.println("Aplicação de locação iniciada com sucesso!");
		System.out.println("Acesse http://localhost:8080");
	}

}
