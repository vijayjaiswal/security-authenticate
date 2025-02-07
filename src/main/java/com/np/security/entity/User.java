package com.np.security.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;

@Entity

@Table(name = "users")

public class User {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String email;

    private String password;

    private boolean enabled;

    private String verificationToken;

// getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getVerificationToken() {
        return verificationToken;
    }

    public void setVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
    }

    @Override
    public String toString() {
        final ReflectionToStringBuilder reflectionToStringBuilder =
                new ReflectionToStringBuilder(this);
        reflectionToStringBuilder.setExcludeFieldNames(
                new String[] {"password","verificationToken", "enabled"});
        reflectionToStringBuilder.setAppendStatics(true);
        reflectionToStringBuilder.setAppendTransients(true);

        return reflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }
}