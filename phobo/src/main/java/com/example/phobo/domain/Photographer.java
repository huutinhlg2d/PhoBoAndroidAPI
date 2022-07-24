package com.example.phobo.domain;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

    public Photographer(User user){
        this.name = user.name;
        this.email = user.email;
        this.password = user.password;
        this.avatarUrl = user.avatarUrl;
        this.dateOfBirth = user.dateOfBirth;
        this.role = user.role;
    }

    @OneToMany(mappedBy = "photographer")
    @JsonIgnore
    Set<Booking> bookings;

    @OneToMany(mappedBy = "photographer", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "photographer-photographer-concept")
    Set<PhotographerConcept> photographerConcepts;
}
