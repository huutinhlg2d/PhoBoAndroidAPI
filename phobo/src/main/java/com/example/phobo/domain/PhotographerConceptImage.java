package com.example.phobo.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PhotographerConceptImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="photographer_concept_id", nullable = false, insertable = true, updatable = true) 
    @JsonBackReference(value = "photographer-concept")
    private PhotographerConcept photographerConcept;

    private String imageUrl;
}
