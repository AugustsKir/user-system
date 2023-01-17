package com.example.usersystem.userbackend

import com.example.usersystem.userbackend.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
interface UserRepository extends JpaRepository<User, Integer> {

    @Modifying
    @Transactional
    @Query("update User u set u.name = :name where u.userID = :id ")
    void updateName(@Param("name") String name, @Param("id") Integer id)

    @Modifying
    @Transactional
    @Query("update User u set u.email = :email where u.userID = :id ")
    void updateEmail(@Param("email") String email, @Param("id") Integer id)

    @Modifying
    @Transactional
    @Query("update User u set u.password = :password where u.userID = :id ")
    void updatePassword(@Param("password") String password, @Param("id") Integer id)

    @Modifying
    @Transactional
    @Query("update User u set u.age = :age where u.userID = :id ")
    void updateAge(@Param("age") Integer age, @Param("id") Integer id)

    @Query("select count(r) from User r where lower(r.email) like lower(:email)")
    int emailExists(@Param("email") String email)


}