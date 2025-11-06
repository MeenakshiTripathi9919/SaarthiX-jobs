package com.saarthix.jobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;  // 👈 add this line

@SpringBootApplication
@EnableWebSecurity   // 👈 add this annotation
public class SaarthiJobsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SaarthiJobsApplication.class, args);
    }
}
