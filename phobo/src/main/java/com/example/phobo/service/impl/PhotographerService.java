package com.example.phobo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.phobo.domain.Photographer;
import com.example.phobo.repository.IPhotographerConceptImageRepository;
import com.example.phobo.repository.IPhotographerConceptRepository;
import com.example.phobo.repository.IPhotographerRepository;
import com.example.phobo.service.IPhotographerService;

@Service
public class PhotographerService implements IPhotographerService{
    @Autowired
    IPhotographerRepository photographerRepository;

    @Autowired
    IPhotographerConceptRepository photographerConceptRepository;

    @Autowired
    IPhotographerConceptImageRepository photographerConceptImageRepository;

    @Override
    public List<Photographer> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Photographer> getById(Integer key) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Photographer save(Photographer entity) {
        return photographerRepository.save(entity);
    }

    @Override
    public void deleteById(Integer key) {
        // TODO Auto-generated method stub
        
    }

}
