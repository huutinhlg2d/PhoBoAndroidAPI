package com.example.phobo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.phobo.service.IPhotographerService;

@RestController
@RequestMapping("/api/photographer")
public class PhotographerController {
    @Autowired
    private IPhotographerService photographerService;
}
