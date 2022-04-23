package com.mohittest.mohittest.repository;

import com.mohittest.mohittest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    public List<User> findByCity(String city);
    public List<User> findByPassword(String password);
    public List<User> findByNameOrPassword(String name, String Password);
}
