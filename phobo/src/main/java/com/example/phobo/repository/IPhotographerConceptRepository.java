package com.example.phobo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.phobo.domain.PhotographerConcept;

@Repository
public interface IPhotographerConceptRepository extends JpaRepository<PhotographerConcept, Integer> {

}
