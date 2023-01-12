package com.example.usersystem.userbackend

import com.example.usersystem.userbackend.domain.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class UserController {
    @Autowired
    UserService service

    @PostMapping("/user")
    void saveUser(@RequestBody User user) {
        service.saveUser(user)
    }

    @DeleteMapping("/user")
    void deleteUser(@RequestBody User user) {
        service.deleteUser(user)
    }

    @GetMapping("/user/all")
    List<User> findAllUsers() {
        service.findAllUsers()
    }

    @PostMapping("/user/update/name")
    void updateName(@RequestBody String name, Integer user_id) {
        service.updateName(name, user_id)
    }

    @PostMapping("/user/update/password")
    void updatePassword(@RequestBody String password, Integer user_id) {
        service.updatePassword(password, user_id)
    }

    @PostMapping("/user/update/age")
    void updateAge(@RequestBody Integer age, Integer user_id) {
        service.updateAge(age, user_id)
    }

    @PostMapping("/user/update/email")
    void updateEmail(@RequestBody String email, Integer user_id) {
        service.updateEmail(email, user_id)
    }
}
