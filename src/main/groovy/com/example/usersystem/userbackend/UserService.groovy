package com.example.usersystem.userbackend

import com.example.usersystem.userbackend.domain.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {
    @Autowired
    UserRepository repository

    void saveUser(User user) {
        repository.save(user)
    }

    void deleteUser(User user) {
        repository.delete(user)
    }

    List<User> findAllUsers() {
        repository.findAll()
    }

    void updateEmail(String email, Integer user_id) {
        repository.updateEmail(email, user_id)
    }

    void updatePassword(String password, Integer user_id) {
        repository.updatePassword(password, user_id)
    }

    void updateAge(Integer age, Integer user_id) {
        repository.updateAge(age, user_id)
    }

    void updateName(String name, Integer user_id) {
        repository.updateName(name, user_id)
    }

    boolean emailExists(String email) {
        return repository.emailExists(email) == 1
    }

    boolean userExists(User user) {
        repository.existsById(user.user_id)
    }

}
