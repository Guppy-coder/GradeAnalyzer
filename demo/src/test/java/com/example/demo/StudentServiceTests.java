package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StudentServiceTests {

    @Autowired
    StudentService studentService;

    @Test
    public void testAddStudent() {
        // create a new student
        StudentEntity student = new StudentEntity();

        ArrayList<String> content = new ArrayList<>();
        content.add("1,John Doe,3.5,90,85,95,80,75");
        // set student data
        student.setName("JohnDoe");
        student.setGpa(3.5);
        HashMap<String,String> courses = new HashMap<>();
        courses.put("Math", "90");
        courses.put("Science", "85");
        courses.put("English", "95");
        courses.put("History", "80");
        courses.put("Art", "75");
        student.setCourses(courses);

        
        // save the student
        studentService.saveStudent(student);
        // verify that the student was saved
        Optional<StudentEntity> savedStudent = studentService.getStudent(student.getId());
        assertEquals(student, savedStudent);
    }

}
