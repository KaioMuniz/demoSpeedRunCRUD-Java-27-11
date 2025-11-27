package com.example.demo.domain.dtos.out;

import java.time.LocalDateTime;

public record DeletarAgendamentoPorIdResponse(
		LocalDateTime entrada,
		LocalDateTime saida,
		String modoPagamento) {

}
