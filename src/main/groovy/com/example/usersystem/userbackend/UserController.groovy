package com.example.usersystem.userbackend

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    @Autowired
    UserService service
}
