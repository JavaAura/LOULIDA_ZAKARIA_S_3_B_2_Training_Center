package com.trainingcenter.repository;

import com.trainingcenter.entity.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Long> {

    // Find training sessions by status
    List<Training> findByStatus(Training.Status status);

    // Find trainings within a specific date range
    List<Training> findBystartDateBetween(LocalDate startDate, LocalDate endDate);
}
