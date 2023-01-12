package com.example.usersystem.userbackend

import com.example.usersystem.userbackend.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface UserRepository extends JpaRepository<User, Integer> {

    @Query("update User set name = :name where user_id = :user_id ")
    void updateName(@Param("name") String name, @Param("user_id") Integer user_id)

    @Query("update User set email = :email where user_id = :user_id ")
    void updateEmail(@Param("email") String email, @Param("user_id") Integer user_id)

    @Query("update User set password = :password where user_id = :user_id ")
    void updatePassword(@Param("password") String password, @Param("user_id") Integer user_id)

    @Query("update User set age = :age where user_id = :user_id ")
    void updateAge(@Param("age") Integer age, @Param("user_id") Integer user_id)

}