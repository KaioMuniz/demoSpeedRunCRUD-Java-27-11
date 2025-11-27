package com.example.demo.domain.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.dtos.in.AtualizarAgendamentoPorIdRequest;
import com.example.demo.domain.dtos.in.ConsultarAgendamentoPorIdRequest;
import com.example.demo.domain.dtos.in.CriarAgendamentoRequest;
import com.example.demo.domain.dtos.out.AtualizarAgendamentoPorIdResponse;
import com.example.demo.domain.dtos.out.ConsultarAgendamentoPorIdResponse;
import com.example.demo.domain.dtos.out.CriarAgendamentoResponse;
import com.example.demo.domain.dtos.out.DeletarAgendamentoPorIdResponse;

@Service
public class AgendamentoService {
	
	@Autowired AgendamentoService agendamentoService;

	public ConsultarAgendamentoPorIdResponse get(UUID id) {

		return null;
	}

	public CriarAgendamentoResponse post(CriarAgendamentoRequest request) {

		return null;
	}

	public AtualizarAgendamentoPorIdResponse put(UUID id, AtualizarAgendamentoPorIdRequest request) {
		return null;
	}

	public DeletarAgendamentoPorIdResponse delete(UUID id) {
		return null;
	}
}
