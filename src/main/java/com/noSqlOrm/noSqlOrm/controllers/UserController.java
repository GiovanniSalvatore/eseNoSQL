package com.noSqlOrm.noSqlOrm.controllers;

import com.noSqlOrm.noSqlOrm.entities.User;
import com.noSqlOrm.noSqlOrm.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }
    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable String id){
        return userRepository.findById(id);
    }
    @GetMapping
    public List<User> getUsers(){
        return userRepository.findAll();
    }
    @PutMapping("/{id}")
    public User editUser(@PathVariable String id, @RequestBody User user){
        user.setId(id);
        return userRepository.save(user);
    }
    @DeleteMapping("/{id}")
    public void deletUser(@PathVariable String id){
        userRepository.deleteById(id);
    }
}
