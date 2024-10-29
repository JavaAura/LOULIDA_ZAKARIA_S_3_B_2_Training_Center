package com.trainingcenter.controller;


import com.trainingcenter.entity.Training;
import com.trainingcenter.service.interfaces.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/trainings")
public class TrainingController {

    @Autowired
    private TrainingService trainingService;

    @GetMapping
    public List<Training> getAllTrainings() {
        return trainingService.getAllTrainings();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Training> getTrainingById(@PathVariable Long id) {
        return trainingService.getTrainingById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Training createTraining(@Valid @RequestBody Training training) {
        return trainingService.createTraining(training);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Training> updateTraining(@PathVariable Long id, @Valid @RequestBody Training training) {
        return ResponseEntity.ok(trainingService.updateTraining(id, training));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTraining(@PathVariable Long id) {
        trainingService.deleteTraining(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/status/{status}")
    public List<Training> getTrainingsByStatus(@PathVariable Training.Status status) {
        return trainingService.getTrainingsByStatus(status);
    }

    @GetMapping("/date-range")
    public List<Training> getTrainingsWithinDateRange(@RequestParam LocalDate startDate, @RequestParam LocalDate endDate) {
        return trainingService.getTrainingsWithinDateRange(startDate, endDate);
    }
}
