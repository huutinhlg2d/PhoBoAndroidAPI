package com.example.phobo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.phobo.service.IConceptService;

@RestController
@RequestMapping("/api/concept")
public class ConceptController {
    @Autowired
    private IConceptService conceptService;
}
