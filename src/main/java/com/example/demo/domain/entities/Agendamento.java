package com.example.demo.domain.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Agendamento")
public class Agendamento {
	
	
	@Column(name="id")
	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	private UUID id;
	
	@Column(name="entrada", nullable=true)
	private LocalDateTime entrada;
	
	@Column(name="saida", nullable=true)
	private LocalDateTime saida;
	
	@Column(name="modoPagamento", nullable=true)
	private String modoPagamento;

}
