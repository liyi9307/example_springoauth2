package com.study.servicehi.controller;


import com.study.servicehi.entity.User;
import com.study.servicehi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserService userService;

    @RequestMapping(value = "/registry", method = RequestMethod.POST)
    public User saneUser(@RequestParam(value = "username")String username,
                         @RequestParam(value = "password")String password){
        return userService.saveUser(username, password);
    }



}
