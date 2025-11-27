package com.example.demo.domain.dtos.out;

import java.time.LocalDateTime;

public record CriarAgendamentoResponse(
		LocalDateTime entrada,
		LocalDateTime saida,
		String modoPagamento) {

}
