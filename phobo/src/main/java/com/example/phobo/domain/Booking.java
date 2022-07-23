package com.example.phobo.domain;

import java.time.LocalDate;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="customer_id", nullable = false, insertable = true)
    @JsonManagedReference(value = "customer")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="photographer_id", nullable = false, insertable = true) 
    @JsonManagedReference(value = "photographer")
    private Photographer photographer;

    @ManyToOne
    @JoinColumn(name="concept_id", nullable = false, insertable = true)
    @JsonManagedReference(value = "concept")
    private Concept concept;

    private LocalDate bookingDate;

    private float bookingRate;

    private float duration;

    private String location;

    private String note;

    private BookingState state;
}
