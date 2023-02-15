package com.example.andreyexam.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;

import java.math.BigDecimal;

@Entity
@Table(name = "users")
public class User extends BaseEntityuuid {
    //⦁	Has a Username (unique)
    //⦁	Username must be unique
    //⦁	Username length must be more than two characters
    //⦁	Has a Password
    //⦁	Password length must be more than two characters
    //⦁	Has an Email
    //⦁	Email must contain '@'
    //⦁	Has a Budget
    //⦁	Must be a positive number
    private String username;
    private String password;
    private String email;
    private BigDecimal budget;
    @Column(name = "username", unique = true, nullable = false)
    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    @Column(name = "password",nullable = false)
    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }
    @Column(name = "email",unique = true, nullable = false)
    @Email
    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }
@Column(name = "budget",nullable = false)
    public BigDecimal getBudget() {
        return budget;
    }

    public User setBudget(BigDecimal budget) {
        this.budget = budget;
        return this;
    }

    public User() {
    }
}
