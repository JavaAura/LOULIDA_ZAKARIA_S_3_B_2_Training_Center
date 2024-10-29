package com.trainingcenter.repository;

import com.trainingcenter.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Long> {

    // Find a classroom by name
    Classroom findByName(String name);
}
