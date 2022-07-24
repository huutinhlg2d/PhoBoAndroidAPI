package com.example.phobo.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.phobo.domain.Photographer;
import com.example.phobo.domain.PhotographerConcept;

@Service
public interface IPhotographerService extends IService<Photographer, Integer> {
    List<PhotographerConcept> getPhotographerConcepts(int id);
}
