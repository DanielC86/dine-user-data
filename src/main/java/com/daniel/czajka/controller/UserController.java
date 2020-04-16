package com.daniel.czajka.controller;

import com.daniel.czajka.entity.Users;
import com.daniel.czajka.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private UsersService usersService;

    @Autowired
    public UserController(UsersService theUsersService){
        usersService = theUsersService;
    }

    //list of all users
    @GetMapping("/all")
    public List<Users> findAll(){
        return usersService.findAll();
    }

}
