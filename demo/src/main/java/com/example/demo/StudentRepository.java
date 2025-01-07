package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    

    public void saveStudent(StudentEntity student){
        // save student to database
    }

    public void deleteStudent(long id){
        // delete student from database
    }
}
