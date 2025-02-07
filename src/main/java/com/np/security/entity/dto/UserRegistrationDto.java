package com.np.security.entity.dto;



public class UserRegistrationDto {
    @javax.validation.constraints.Email
    @javax.validation.constraints.NotBlank
    String email;

    @javax.validation.constraints.NotBlank
    @javax.validation.constraints.Size(min = 8)
    String password;

    // Constructor
    public UserRegistrationDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public CharSequence getPassword() {
        return password;
    }
}

