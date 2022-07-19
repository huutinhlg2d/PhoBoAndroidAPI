package com.example.phobo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.phobo.domain.PhotographerConceptImage;

@Repository
public interface IPhotographerConceptImageRepository extends JpaRepository<PhotographerConceptImage, Integer> {

}
