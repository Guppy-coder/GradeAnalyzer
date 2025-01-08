package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository StudentRepository;
    
    public StudentService() {
        // constructor
    }


    public void CreateStudent(ArrayList<String> content){
        // sort student data
        // create student object
        StudentEntity student = new StudentEntity();
        for (int i = 0; i < content.size(); i++) {
            // read student data
            String[] studentData = content.get(i).split(",");
            student.setId(Long.parseLong(studentData[0]));
            student.setName(studentData[1]);
            student.setGpa(Double.parseDouble(studentData[2]));
            HashMap<String, String> courses = new HashMap<>();
            courses.put("Math", studentData[3]);
            courses.put("Science", studentData[4]);
            courses.put("English", studentData[5]);
            courses.put("History", studentData[6]);
            courses.put("Art", studentData[7]);
            student.setCourses(courses);
        }
        // save student to database
        StudentRepository.saveStudent(student);
    }

    public StudentEntity getStudent(long id){
        return StudentRepository.findById(id);
    }

    public void deleteStudent(long id){
        StudentRepository.deleteStudent(id);
    }
}
