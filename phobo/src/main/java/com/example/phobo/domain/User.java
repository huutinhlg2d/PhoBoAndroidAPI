package com.example.phobo.domain;

import java.sql.Date;
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
    protected int id;

    protected int firebaseUid;

    @Nationalized
    protected String name;

    protected String email;

    protected String password;

    protected String avatarUrl;

    protected Date dateOfBirth;

    protected UserRole role;

    protected boolean isDeleted;

    public User(String name, String email, String password, String avatarUrl, Date dateOfBirth, UserRole role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.avatarUrl = avatarUrl;
        this.dateOfBirth = dateOfBirth;
        this.role = role;
    }

    
}
