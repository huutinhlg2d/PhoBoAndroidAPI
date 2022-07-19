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
public class Photographer extends User {
    float rate;

    @OneToMany(mappedBy = "photographer")
    Set<Booking> bookings;

    @OneToMany(mappedBy = "photographer", cascade = CascadeType.ALL)
    Set<PhotographerConcept> photographerConcepts;
}
