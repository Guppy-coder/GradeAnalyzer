package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentServiceTests {

    @Test
    public void testAddStudent() {
        // create a new student
        StudentService studentService = new StudentService();
        StudentEntity student = new StudentEntity();

        ArrayList<String> content = new ArrayList<>();
        content.add("1,John Doe,3.5,90,85,95,80,75");
        // set student data
        studentService.CreateStudent(content);

        
        // save the student
        studentService.CreateStudent(content);
        // verify that the student was saved
        StudentEntity savedStudent = studentService.getStudent(student.getId());
        assertEquals(student, savedStudent);
    }

}
