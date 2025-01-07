package com.example.demo;

import java.util.HashMap;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter // lombok annotation to generate getter methods
@Setter // lombok annotation to generate setter methods

public class StudentEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String name;
    Double gpa;
    HashMap<String, String> courses;


}
