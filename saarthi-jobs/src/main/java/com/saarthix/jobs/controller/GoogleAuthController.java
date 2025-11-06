package com.saarthix.jobs.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GoogleAuthController {

    @GetMapping("/api/auth/google/success")
    public Map<String, Object> success(@AuthenticationPrincipal OAuth2User user) {
        if (user == null || user.getAttributes() == null) {
            return Map.of("error", "No user data found — login may not be complete yet");
        }

        return Map.of(
            "message", "✅ Google Login Successful!",
            "email", user.getAttribute("email"),
            "name", user.getAttribute("name"),
            "picture", user.getAttribute("picture")
        );
    }

    @GetMapping("/api/auth/google/failure")
    public Map<String, Object> failure() {
        return Map.of("error", "❌ Google Login Failed");
    }
}
