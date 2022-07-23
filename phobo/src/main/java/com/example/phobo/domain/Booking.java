package com.example.phobo.domain;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
    @JsonBackReference(value = "customer")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="photographer_id", nullable = false, insertable = true) 
    @JsonBackReference(value = "photographer")
    private Photographer photographer;

    @ManyToOne
    @JoinColumn(name="concept_id", nullable = false, insertable = true)
    @JsonBackReference(value = "concept")
    private Concept concept;

    private Date bookingDate;

    private float bookingRate = 0;

    private float duration;

    private String location;

    private String note;

    private BookingState state = BookingState.WAITING;
}
