package com.restexample.model.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

//@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
@Repository
public class UserDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String encryptedPassword;

//    private String emailVerificationToken;
//    private String emailVerificationStatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

}
