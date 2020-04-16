package com.daniel.czajka.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int userId;

    @Column(name = "firstname")
    private String userFirstName;

    @Column(name = "lastname")
    private String userLastName;

    @Column(name = "email")
    private String userEmail;

    @Column(name = "usertype")
    private String userType;
}
