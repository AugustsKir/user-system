package com.example.usersystem.userbackend

import com.example.usersystem.userbackend.domain.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

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

    @DeleteMapping("/user")
    void deleteUser(@RequestBody User user) {
        if (service.userExists(user)) {
            service.deleteUser(user)
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND)
        }
    }

    @GetMapping("/user/all")
    List<User> findAllUsers() {
        service.findAllUsers()
    }

    @PostMapping("/user/{id}/name")
    void updateName(@RequestBody String name, @PathVariable Integer id) {
        service.updateName(name, id)
    }

    @PostMapping("/user/{id}/password")
    void updatePassword(@RequestBody String password, @PathVariable Integer id) {
        service.updatePassword(password, id)
    }

    @PostMapping("/user/{id}/age")
    void updateAge(@RequestBody Integer age, @PathVariable Integer id) {
        service.updateAge(age, id)
    }

    @PostMapping("/user/{id}/email")
    void updateEmail(@RequestBody String email, @PathVariable Integer id) {
        service.updateEmail(email, id)
    }
}
