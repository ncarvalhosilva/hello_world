package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aprendizagem")
public class ObjAprendizagemController {
	
	@GetMapping
	public String aprendizagem() {
		return "Objetivos de aprendizagem da semana:<br> <li>aprender Spring Boot"
				+ "<br> <li>revisar MySQL <br> <li>trabalhar em equipe no projeto integrador"
				+ "<br> <li>aplicar tudo que aprendi no meu blog pessoal <br> <li>persistir!";
	}

}