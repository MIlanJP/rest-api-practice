package com.restexample.controller;

import com.restexample.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping
    public String getUser(){
        return "get user";
    }

    @PostMapping
    public String createUser(@RequestBody User user){
        return "createUser";
    }

    @PutMapping
    public String updateUser(){
        return "updateUser";
    }

    @DeleteMapping
    public String deleteUser(){
        return "deleteUser";
    }

}
