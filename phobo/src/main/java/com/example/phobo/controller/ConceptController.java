package com.example.phobo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.phobo.domain.Concept;
import com.example.phobo.service.IConceptService;


@RestController
@RequestMapping("/api/concept")
public class ConceptController {
    @Autowired
    private IConceptService conceptService;
    
    @GetMapping("/all")
    public ResponseEntity<List<Concept>> getAll() {

        List<Concept> concepts = conceptService.getAll();

        return ResponseEntity.ok(concepts);
    }

}
