package com.example.phobo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.phobo.domain.Concept;

@Repository
public interface IConceptRepository extends JpaRepository<Concept, Integer> {

}