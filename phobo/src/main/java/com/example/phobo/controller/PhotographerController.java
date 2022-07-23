package com.example.phobo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.phobo.domain.Photographer;
import com.example.phobo.domain.PhotographerConcept;
import com.example.phobo.service.IConceptService;
import com.example.phobo.service.IPhotographerService;


@RestController
@RequestMapping("/api/photographer")
public class PhotographerController {
    @Autowired
    private IPhotographerService photographerService;

    @Autowired
    private IConceptService concService;

    @GetMapping("/all")
    public ResponseEntity<List<Photographer>> getAll() {

        List<Photographer> photographers = photographerService.getAll();

        return ResponseEntity.ok(photographers);
    }

    @GetMapping("/concept/{id}")
    public ResponseEntity<List<PhotographerConcept>> getPhotographerConcepts(@PathVariable Integer id) {

        List<PhotographerConcept> photographers = photographerService.getPhotographerConcepts(id);

        return ResponseEntity.ok(photographers);
    }
}
