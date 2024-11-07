package com.example.crud;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "eng_name", nullable = false)
    private String eng_name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "faculty", nullable = false)
    private String faculty;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "user_name", nullable = false)
    private String user_name;

    // Getters
    public Long getId() {
        return id;
    }

    public String getEng_name() {
        return eng_name;
    }

    public String getEmail() {
        return email;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getType() {
        return type;
    }

    public String getUser_name() {
        return user_name;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setEng_name(String eng_name) {
        this.eng_name = eng_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}