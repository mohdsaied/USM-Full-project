package com.doctor.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "appuserregistration")
public class AppUserRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Column(name = "username",nullable = false ,length=20)
    private String username;

    @Column(name = "password",nullable = false, length=100)
    private String password;

    @Column(name = "phone_number",nullable = false, length=10)
    private Integer phoneNumber;

    @Column(name = "email",nullable = false, length=150)
    private String email;

    @Column(name = "role",nullable = false, length=20)
    private String role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

}
