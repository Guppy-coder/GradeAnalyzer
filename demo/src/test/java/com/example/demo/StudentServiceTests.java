package com.example.demo;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentServiceTests {

    @Test
    public void testAddStudent() {
        // create a new student
        StudentService studentService = new StudentService();
        StudentEntity student = new StudentEntity();
        student.setName("John Doe");
        student.setGpa(3.5);
        HashMap<String, String> courses = new HashMap<>();
        courses.put("Math", "A");
        courses.put("Science", "B");
        student.setCourses(courses);
        
        // save the student
        
        // verify that the student was saved
        StudentEntity savedStudent = studentService.getStudent(student.getId());
        assertEquals(student, savedStudent);
    }

}
