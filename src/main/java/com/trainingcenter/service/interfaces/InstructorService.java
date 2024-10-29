package com.trainingcenter.service.interfaces;

import com.trainingcenter.entity.Instructor;

import java.util.List;
import java.util.Optional;

public interface InstructorService {

    List<Instructor> getAllInstructors();

    Optional<Instructor> getInstructorById(Long id);

    Instructor createInstructor(Instructor instructor);

    Instructor updateInstructor(Long id, Instructor instructor);

    void deleteInstructor(Long id);

    List<Instructor> getInstructorsBySpeciality(String speciality);
}
