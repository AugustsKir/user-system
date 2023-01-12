package com.example.usersystem.userbackend

import com.example.usersystem.userbackend.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface UserRepository extends JpaRepository<User, Integer> {

    @Query("update User set name = :name where userID = :id ")
    void updateName(@Param("name") String name, @Param("id") Integer id)

    @Query("update User set email = :email where userID = :id ")
    void updateEmail(@Param("email") String email, @Param("id") Integer id)

    @Query("update User set password = :password where userID = :id ")
    void updatePassword(@Param("password") String password, @Param("id") Integer id)

    @Query("update User set age = :age where userID = :id ")
    void updateAge(@Param("age") Integer age, @Param("id") Integer id)

    @Query("select count(r) from User r where lower(r.email) like lower(:email)")
    int emailExists(@Param("email") String email)

}