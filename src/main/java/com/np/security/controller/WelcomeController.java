package com.np.security.controller;

import com.np.security.entity.User;
import com.np.security.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class WelcomeController {

    private UserService userService;
    private static Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    public WelcomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/home")
    public ResponseEntity<?> home() {
        logger.info("Welcome!");
        // Get username from security context
        final String username = SecurityContextHolder.getContext()
                .getAuthentication()
                .getName();
        User user = userService.getUserByEmail(username);
        logger.info("User is welcomed: " + user.toString());
        return ResponseEntity.ok("Welcome " + user.toString());
    }
}
