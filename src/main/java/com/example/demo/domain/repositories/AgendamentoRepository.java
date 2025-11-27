package com.example.demo.domain.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.entities.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, UUID> {

}
