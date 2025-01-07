package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentService {
    
    public StudentService(){
        // constructor
    }

    public HashMap readStudentData(ArrayList<String> content){
        // read student data from csv file
        for (int i = 0; i < content.size(); i++) {
            // read student data
            String[] studentData = content.get(i).split(",");
            // create student object
            StudentEntity student = new StudentEntity();
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
        return null;
    }

    public StudentEntity getStudent(long id){
        // get student from database
        return null;
    }
}
