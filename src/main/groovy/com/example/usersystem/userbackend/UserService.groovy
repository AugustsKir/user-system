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

    void updateEmail(String email, Integer id) {
        repository.updateEmail(email, id)
    }

    void updatePassword(String password, Integer id) {
        repository.updatePassword(password, id)
    }

    void updateAge(Integer age, Integer id) {
        repository.updateAge(age, id)
    }

    void updateName(String name, Integer id) {
        repository.updateName(name, id)
    }

    boolean emailExists(String email) {
        return repository.emailExists(email) == 1
    }

    boolean userExists(User user) {
        repository.existsById(user.userID)
    }

}
