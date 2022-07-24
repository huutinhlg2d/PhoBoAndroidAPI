package com.example.phobo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.phobo.domain.PhotographerConcept;
import com.example.phobo.domain.User;

@Repository
public interface IPhotographerConceptRepository extends JpaRepository<PhotographerConcept, Integer> {
    List<PhotographerConcept> findByPhotographerId(Integer id);
}
