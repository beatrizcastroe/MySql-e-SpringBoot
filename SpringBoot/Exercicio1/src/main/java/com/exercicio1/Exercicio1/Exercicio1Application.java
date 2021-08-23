package com.exercicio1.Exercicio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class Exercicio1Application {
	
	@GetMapping("/")
	public String bemvindo() {
		return "Olá a todes! Bem-vindes. Nessa atividade utilizei algumas habilidades e mentalidades.";
	}
	
	@GetMapping("/1")
	public String habilidade() {
		return "A habilidade que mais utilizei foi a de atenção aos detalhes, porque spring boot exige cuidado e requer muita atenção.";
	}
	
	@GetMapping("/2")
	public String mentalidade() {
		return "A mentalidade que mais utilizei foi a de persistência, pois no começo é difícil mas não podemos desistir.";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Exercicio1Application.class, args);
	}

}
