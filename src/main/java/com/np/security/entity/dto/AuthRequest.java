package com.np.security.entity.dto;


public class AuthRequest {
    @javax.validation.constraints.Email
    @javax.validation.constraints.NotBlank
    String email;
    @javax.validation.constraints.NotBlank
    String password;

    // Constructor
    public AuthRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
