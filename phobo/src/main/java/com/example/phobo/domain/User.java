package com.example.phobo.domain;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.Nationalized;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    private Date dateOfBirth;

    private UserRole role;

    private boolean isDeleted;

}
