package com.example.demo.domain.dtos.in;

import java.time.LocalDateTime;

public record ConsultarAgendamentoPorIdRequest(
		LocalDateTime entrada,
		LocalDateTime saida,
		String modoPagamento) {

}
