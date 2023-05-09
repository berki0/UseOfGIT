package com.example.UseOfGIT;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/User")
public class Controller {
     final UserService userService;

    public Controller(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public String addNewUser(User user){
        return userService.addNewUser(user);
    }

    @GetMapping
    public Object[] listAllUser(){
        return userService.returnListOfUsers();
    }
}
