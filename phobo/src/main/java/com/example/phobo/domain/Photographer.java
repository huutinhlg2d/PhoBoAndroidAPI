package com.example.phobo.domain;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Photographer extends User {
    float rate;

    @OneToMany(mappedBy = "photographer")
    @JsonManagedReference
    Set<Booking> bookings;

    @OneToMany(mappedBy = "photographer", cascade = CascadeType.ALL)
    @JsonManagedReference
    Set<PhotographerConcept> photographerConcepts;
}
