package com.example.phobo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.phobo.domain.Photographer;
import com.example.phobo.service.IPhotographerService;


@RestController
@RequestMapping("/api/photographer")
public class PhotographerController {
    @Autowired
    private IPhotographerService photographerService;

    @GetMapping("/all")
    public ResponseEntity<List<Photographer>> getAll() {

        List<Photographer> photographers = photographerService.getAll();

        return ResponseEntity.ok(photographers);
    }
}
