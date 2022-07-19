package com.example.phobo.domain;

import java.util.Set;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PhotographerConcept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="photographer_id", nullable = false, insertable = true) 
    private Photographer photographer;

    @ManyToOne
    @JoinColumn(name="concept_id", nullable = false, insertable = true)
    private Concept concept;

    private String durationConfig;

    @OneToMany(mappedBy = "photographerConcept", cascade = CascadeType.ALL)
    private Set<PhotographerConceptImage> photographerConceptImages;
}
