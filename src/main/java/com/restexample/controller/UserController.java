package com.restexample.controller;

import com.restexample.model.User;
import com.restexample.model.dto.UserDto;
import com.restexample.model.response.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserDto userDto;

    @GetMapping
    public String getUser(){
        return "get user";
    }

    @PostMapping
    public UserRest createUser(@RequestBody User user){
        BeanUtils.copyProperties(user,userDto);
        return null;
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
