package com.example.demo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/agenda")
public class AgendamentoController {
	
	@GetMapping
	public void consultarAgendamentoPorId() {
		
	}
	
	@PostMapping
	public void criarAgendamento() {
		
	}
	
	@PutMapping
	public void atualizarAgendamentoPorId() {
		
	}
	
	@DeleteMapping
	public void deletarAgendamentoPorId() {
		
	}
	

}
