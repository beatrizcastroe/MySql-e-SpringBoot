package com.exercicio2.Exercicio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class Exercicio2Application {

	@GetMapping("/")
	public String bemvindo() {
		return "Olá a todes! Bem-vindes. Nessa aula tivemos alguns objetivos de aprendizagem.";
	}

	@GetMapping("/1")
	public String objetivos() {
		return "Os objetivos de aprendizagem foram: "
				+ "\nAprender sobre frameworks: conjunto de ferramentas que permitem um rápido desenvolvimento de APIs;"
				+ "\nMVC: uma arquitetura com 3 modelos: Modelo, Visualização e Controladores;"
				+ "\nMaven: Um gestor de dependências que ajudam na organização;"
				+ "\nDependências: Recursos prontos para as aplicações;"
				+ "\nSpring Boot: Oferece uma rápida maneira de desenvolver. Framework baseado em JAVA. ";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Exercicio2Application.class, args);
	}
}