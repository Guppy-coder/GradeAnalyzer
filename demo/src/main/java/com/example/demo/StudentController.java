package com.example.demo;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    StudentService studentService;

    @GetMapping("/students/{id}")
    public ResponseEntity<StudentEntity> getStudentById(@PathVariable long id) {
        Optional<StudentEntity> student = studentService.getStudent(id);
        if (student.isPresent()){
            return new ResponseEntity<>(student.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // @PostMapping
    // public ResponseEntity<StudentEntity> addEntity(@RequestBody StudentEntity studentEntity) {
    //     StudentEntity savedStudent = studentService.saveStudent(studentEntity);
    //     return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    // }
}
