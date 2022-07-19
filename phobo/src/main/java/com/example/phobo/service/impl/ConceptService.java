package com.example.phobo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.phobo.domain.Concept;
import com.example.phobo.service.IConceptService;

@Service
public class ConceptService implements IConceptService{

    @Override
    public List<Concept> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Concept> getById(Integer key) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Concept save(Concept entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteById(Integer key) {
        // TODO Auto-generated method stub
        
    }

}