package com.example.demo.domain.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.dtos.in.AtualizarAgendamentoPorIdRequest;
import com.example.demo.domain.dtos.in.CriarAgendamentoRequest;
import com.example.demo.domain.dtos.out.AtualizarAgendamentoPorIdResponse;
import com.example.demo.domain.dtos.out.ConsultarAgendamentoPorIdResponse;
import com.example.demo.domain.dtos.out.CriarAgendamentoResponse;
import com.example.demo.domain.dtos.out.DeletarAgendamentoPorIdResponse;
import com.example.demo.domain.entities.Agendamento;
import com.example.demo.domain.repositories.AgendamentoRepository;

@Service
public class AgendamentoService {
	
	@Autowired AgendamentoRepository agendamentoRepository;

	public ConsultarAgendamentoPorIdResponse get(UUID id) {

		var agenda = agendamentoRepository.findById(id).orElseThrow(() -> new RuntimeException());
		
		
		
		return new ConsultarAgendamentoPorIdResponse(
				agenda.getEntrada(),
				agenda.getSaida(),
				agenda.getModoPagamento());
	}

	public CriarAgendamentoResponse post(CriarAgendamentoRequest request) {

		var agenda = new Agendamento();
		
		agenda.setEntrada(agenda.getEntrada());
		agenda.setSaida(agenda.getSaida());
		agenda.setModoPagamento(agenda.getModoPagamento());
		
		agendamentoRepository.save(agenda);
		
		
		
		return new CriarAgendamentoResponse(
				agenda.getEntrada(),
				agenda.getSaida(),
				agenda.getModoPagamento());
		
		
	}

	public AtualizarAgendamentoPorIdResponse put(UUID id, AtualizarAgendamentoPorIdRequest request) {
		
		var agenda = agendamentoRepository.findById(id).orElseThrow(() -> new RuntimeException());
		
		
		agenda.setEntrada(agenda.getEntrada());
		agenda.setSaida(agenda.getSaida());
		agenda.setModoPagamento(agenda.getModoPagamento());
		
		agendamentoRepository.save(agenda);
		
		
		
		return new AtualizarAgendamentoPorIdResponse(
				agenda.getEntrada(),
				agenda.getSaida(),
				agenda.getModoPagamento());
	}

	public DeletarAgendamentoPorIdResponse delete(UUID id) {
		
		var agenda = agendamentoRepository.findById(id).orElseThrow(() -> new RuntimeException());
		
		agendamentoRepository.findById(id);
		
		return new DeletarAgendamentoPorIdResponse(
				agenda.getEntrada(),
				agenda.getSaida(),
				agenda.getModoPagamento()
				);
	}
}
