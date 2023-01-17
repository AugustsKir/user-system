package com.example.usersystem.userbackend

import com.example.usersystem.userbackend.domain.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@CrossOrigin
@RestController
@RequestMapping("/api")
class UserController {
    @Autowired
    UserService service

    @PostMapping("/user")
    void saveUser(@RequestBody User user) {
        if (!service.emailExists(user.email)) {
            service.saveUser(user)
        } else {
            throw new ResponseStatusException(HttpStatus.CONFLICT)
        }
    }

    @DeleteMapping("/user/{id}")
    void deleteUser(@PathVariable Integer id) {
        if (service.userExists(id)) {
            service.deleteUser(id)
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND)
        }
    }

    @GetMapping("/user/all")
    List<User> findAllUsers() {
        service.findAllUsers()
    }

    @PostMapping("/user/update")
    void updateUser(@RequestBody User user) {
        if (service.userExists(user.userID)) {
            service.updateName(user.name, user.userID)
            service.updateAge(user.age, user.userID)
            service.updateEmail(user.email, user.userID)
            service.updatePassword(user.password, user.userID)
        }
    }

    @GetMapping("/user/{id}")
    User findByID(@PathVariable Integer id) {
        service.findByID(id)
    }
}
