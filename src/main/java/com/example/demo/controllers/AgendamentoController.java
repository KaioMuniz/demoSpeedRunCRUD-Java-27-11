package com.example.demo.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.dtos.in.AtualizarAgendamentoPorIdRequest;
import com.example.demo.domain.dtos.in.CriarAgendamentoRequest;
import com.example.demo.domain.dtos.out.AtualizarAgendamentoPorIdResponse;
import com.example.demo.domain.dtos.out.ConsultarAgendamentoPorIdResponse;
import com.example.demo.domain.dtos.out.CriarAgendamentoResponse;
import com.example.demo.domain.dtos.out.DeletarAgendamentoPorIdResponse;
import com.example.demo.domain.services.AgendamentoService;

@RestController
@RequestMapping("/api/v1/agenda")
public class AgendamentoController {
	
	@Autowired AgendamentoService agendamentoService;
	
	@GetMapping
	public ResponseEntity<ConsultarAgendamentoPorIdResponse> consultarAgendamentoPorId(@RequestParam UUID id) {
		
		
		return ResponseEntity.ok(agendamentoService.get(id));
	}
	
	@PostMapping
	public ResponseEntity<CriarAgendamentoResponse> criarAgendamento(@RequestBody CriarAgendamentoRequest request ) {
		
		
		return ResponseEntity.ok(agendamentoService.post(request));
	}
	
	@PutMapping
	public ResponseEntity<AtualizarAgendamentoPorIdResponse> atualizarAgendamentoPorId(@RequestParam UUID id,@RequestBody AtualizarAgendamentoPorIdRequest request ) {
		
		
		return ResponseEntity.ok(agendamentoService.put(id, request));
	}
	
	@DeleteMapping
	public ResponseEntity<DeletarAgendamentoPorIdResponse> deletarAgendamentoPorId(@RequestParam UUID id) {
		
		return ResponseEntity.ok(agendamentoService.delete(id));
		
	}
	

}
