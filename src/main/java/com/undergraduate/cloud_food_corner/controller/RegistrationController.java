package com.undergraduate.cloud_food_corner.controller;

import com.undergraduate.cloud_food_corner.model.User;
import com.undergraduate.cloud_food_corner.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping
    public String showRegistration() {
        return "registration";
    }

    @PostMapping
    public String processRegistration(String username, String password, String fullName,
                                      String street, String city, String state,
                                      String zip, String phoneNumber) {
        User user = new User(username, passwordEncoder.encode(password),
                fullName, street, city, state, zip, phoneNumber);
        userRepository.save(user);
        return "redirect:/login";
    }
}