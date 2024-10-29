package com.trainingcenter.service.interfaces;


import com.trainingcenter.entity.Training;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface TrainingService {

    List<Training> getAllTrainings();

    Optional<Training> getTrainingById(Long id);

    Training createTraining(Training training);

    Training updateTraining(Long id, Training training);

    void deleteTraining(Long id);


    List<Training> getTrainingsByStatus(Training.Status status);

    List<Training> getTrainingsWithinDateRange(LocalDate startDate, LocalDate endDate);
}
