package com.example.usersystem.userbackend.domain

import jakarta.persistence.*

@Entity
@Table(name = "user_data")
class User {
    @Column
    String name
    @Column
    String email
    @Column
    String password
    @Column
    int age
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    Integer userID

    User(String name, String email, String password, int age) {
        this.name = name
        this.email = email
        this.password = password
        this.age = age
    }

    User() {

    }
}
