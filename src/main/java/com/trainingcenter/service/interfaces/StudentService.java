package com.trainingcenter.service.interfaces;


import com.trainingcenter.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAllStudents();

    Optional<Student> getStudentById(Long id);

    Student createStudent(Student student);

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);

    List<Student> getStudentsByClassroomId(Long classroomId);
}