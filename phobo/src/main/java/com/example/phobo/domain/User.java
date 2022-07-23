package com.example.phobo.domain;

import java.time.LocalDate;

import javax.persistence.*;

import org.hibernate.annotations.Nationalized;

import lombok.*;

@Entity
@Table(name = "[user]")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int firebaseUid;

    @Nationalized
    private String name;

    private String email;

    private String password;

    private String avatarUrl;

    private LocalDate dateOfBirth;

    private UserRole role;

    private boolean isDeleted;

}
