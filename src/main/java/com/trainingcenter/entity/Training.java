package com.trainingcenter.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2, max = 100)
    private String title;

    @NotNull
    private String level;

    @Size(max = 200)
    private String prerequisites;

    @NotNull
    private int minCapacity;

    @NotNull
    private int maxCapacity;

    @NotNull
    private LocalDate startDate;

    @NotNull
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Status status;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

    @OneToMany(mappedBy = "training")
    private List<Student> students;

    public enum Status {
        PLANNED, IN_PROGRESS, COMPLETED, CANCELED
    }
}
