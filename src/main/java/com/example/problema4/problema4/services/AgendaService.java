package com.example.problema4.problema4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.problema4.problema4.entities.Agenda;
import com.example.problema4.problema4.repositories.AgendaRepository;

@Service
public class AgendaService {
    
    @Autowired
    private AgendaRepository repository;

    public List<Agenda> findAll() {
        return repository.findAll();
    }

    public Agenda findById(Long id) {
        return repository.findById(id).get();
    }

    public Agenda insert(Agenda data) {
        return repository.save(data);
    }

}
