package com.saarthix.jobs.util;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncoderUtil implements CommandLineRunner {
    @Override
    public void run(String... args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println("Encoded: " + encoder.encode("AdminPass123"));
    }
}
