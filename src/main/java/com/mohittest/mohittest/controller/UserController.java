package com.mohittest.mohittest.controller;

import com.mohittest.mohittest.model.User;
import com.mohittest.mohittest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stackInstance")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){

        userService.saveUser(user);
        return "saved user successfully";
    }
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){

        return userService.getAllUsers();
    }
    @GetMapping("/getUserById/{id}")
    public Optional<User> getUserById(@PathVariable int id){

        return  userService.getUserById(id);
    }
    @GetMapping("/getUserByCityName/{city}")
    public List<User> getUserByCity(@PathVariable String city){
        return userService.getUserByCity(city);
    }
    @GetMapping("/getUserByNameOrPassword/{name}/{password}")
    public List<User> getUserByNameOrPassword(@PathVariable String name , @PathVariable String password){
        return userService.getUserByNameOrPassword(name, password);
    }
    @GetMapping("/getUserByPassword/{password}")
    public List<User> getUserByPassword(@PathVariable String password){
        return userService.getUserByPassword(password);
    }

}
