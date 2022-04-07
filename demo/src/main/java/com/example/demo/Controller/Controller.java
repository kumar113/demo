package com.example.demo.Controller;

import com.example.demo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    UserRepository userRepository;
    @RequestMapping("/users")
    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }
    @GetMapping("/test")
    public String test(){
        return "hello";
    }
}

