package com.example.phobo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.phobo.domain.Photographer;

@Repository
public interface IPhotographerRepository extends JpaRepository<Photographer, Integer> {

}
