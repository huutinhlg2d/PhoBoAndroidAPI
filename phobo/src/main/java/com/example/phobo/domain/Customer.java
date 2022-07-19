package com.example.phobo.domain;

import java.util.Set;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@ToString
public class Customer extends User {
    @OneToMany(mappedBy = "customer")
    Set<Booking> bookings;
}
