package com.example.phobo.domain;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.*;

@Entity
@Getter
@Setter
@ToString
public class Customer extends User {
    
    @OneToMany(mappedBy = "customer")
    @JsonBackReference(value = "customer")
    Set<Booking> bookings;
}
