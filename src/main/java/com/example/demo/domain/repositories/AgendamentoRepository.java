package com.example.demo.domain.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.entities.Agendamento;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, UUID> {

}
