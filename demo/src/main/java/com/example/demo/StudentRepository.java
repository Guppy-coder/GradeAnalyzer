package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
    
    StudentEntity findById(long id);
    
    public void saveStudent(StudentEntity student);

    public void deleteStudent(long id);
}
