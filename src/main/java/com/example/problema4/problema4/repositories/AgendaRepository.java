package com.example.problema4.problema4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.problema4.problema4.entities.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
    
}
