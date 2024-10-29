package com.trainingcenter.repository;


import com.trainingcenter.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // Find students by class ID
    List<Student> findByClassroomId(Long classroomId);

    // Find students by email
    List<Student> findByEmail(String email);
}
