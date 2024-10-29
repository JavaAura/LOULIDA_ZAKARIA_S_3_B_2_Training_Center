package com.trainingcenter.service.implementation;

import com.trainingcenter.entity.Training;
import com.trainingcenter.repository.TrainingRepository;
import com.trainingcenter.service.interfaces.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TrainingServiceImpl implements TrainingService {

    @Autowired
    private TrainingRepository trainingRepository;

    @Override
    public List<Training> getAllTrainings() {
        return trainingRepository.findAll();
    }

    @Override
    public Optional<Training> getTrainingById(Long id) {
        return trainingRepository.findById(id);
    }

    @Override
    public Training createTraining(Training training) {
        return trainingRepository.save(training);
    }

    @Override
    public Training updateTraining(Long id, Training training) {
        training.setId(id);
        return trainingRepository.save(training);
    }

    @Override
    public void deleteTraining(Long id) {
        trainingRepository.deleteById(id);
    }

    @Override
    public List<Training> getTrainingsByStatus(Training.Status status) {
        return trainingRepository.findByStatus(status);
    }

    @Override
    public List<Training> getTrainingsWithinDateRange(LocalDate startDate, LocalDate endDate) {
        return trainingRepository.findBystartDateBetween(startDate, endDate);
    }
}
