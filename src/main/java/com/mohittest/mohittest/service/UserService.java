package com.mohittest.mohittest.service;

import com.mohittest.mohittest.model.User;
import com.mohittest.mohittest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user){

        userRepository.save(user);
    }
    public List<User> getAllUsers(){

        return userRepository.findAll();
    }
    public Optional<User> getUserById(int id){

        return userRepository.findById(id);
    }
    public List<User> getUserByCity(String city){

        return userRepository.findByCity(city);

    }
    public List<User> getUserByNameOrPassword(String name, String password){

        return userRepository.findByNameOrPassword(name,password);
    }
    public List<User> getUserByPassword(String password){

        return userRepository.findByPassword(password);
    }
}
