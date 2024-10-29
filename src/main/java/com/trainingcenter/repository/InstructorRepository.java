package com.trainingcenter.repository;


import com.trainingcenter.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

    // Find instructors by specialty

    List<Instructor> findBySpecialty(String specialty);
    // Find instructors assigned to a specific class ID
    List<Instructor> findByClassroomId(Long classroomId);
}
