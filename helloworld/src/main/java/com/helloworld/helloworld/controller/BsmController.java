package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm-generation")
public class BsmController {
	
	@GetMapping
	public String bsmGeneration() {
		return "A seguir veja as BSM's trabalhadas na Generation Brasil<br><br>COMPETÊNCIAS COMPORTAMENTAIS:"
				+ "<br><li>Comunicação<br><li>Proatividade<br><li>Orientação ao detalhe"
				+ "<br><li>Trabalho em equipe<br><br>MENTALIDADES:<br>"
				+ "<li>Orientação ao futuro<br><li>Responsabilidade pessoal"
				+ "<br><li>Mentalidade de crescimento<br><li>Persistência";
	}

}
