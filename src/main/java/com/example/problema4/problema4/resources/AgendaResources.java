package com.example.problema4.problema4.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.problema4.problema4.entities.Agenda;
import com.example.problema4.problema4.services.AgendaService;

@RestController
@RequestMapping(value = "/api/agenda")
public class AgendaResources {
    
    @Autowired
    private AgendaService service;

    @GetMapping
    public ResponseEntity<List<Agenda>> findAll() {
        List<Agenda> lista = service.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Agenda> findById(@PathVariable Long id) {
        Agenda data = service.findById(id);
        return ResponseEntity.ok().body(data);
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody Agenda data) {
        service.insert(data);
        return ResponseEntity.ok().build();
    }
}
