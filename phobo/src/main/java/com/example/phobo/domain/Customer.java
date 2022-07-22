package com.example.phobo.domain;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

@Entity
@Getter
@Setter
@ToString
public class Customer extends User {
    
    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    Set<Booking> bookings;
}
