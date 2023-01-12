package com.example.usersystem.userbackend.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

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
    Integer user_id

    User(String name, String email, String password, int age) {
        this.name = name
        this.email = email
        this.password = password
        this.age = age
    }

    User() {

    }
}
