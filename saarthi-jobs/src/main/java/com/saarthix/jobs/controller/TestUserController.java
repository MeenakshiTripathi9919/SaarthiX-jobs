package com.saarthix.jobs.controller;

import com.saarthix.jobs.model.User;
import com.saarthix.jobs.model.Role;
import com.saarthix.jobs.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth/test/users")
public class TestUserController {

    private final UserRepository userRepository;

    public TestUserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String testEndpoint() {
        return "✅ Security is configured and API is running!";
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
