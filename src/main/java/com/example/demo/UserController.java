package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserRepository userRepo;

  @PostMapping
  public User saveUser(@RequestBody User user) {
    return userRepo.save(user);
  }

  @GetMapping
  public List<User> getAllUsers() {
    return userRepo.findAll();
  }
}
