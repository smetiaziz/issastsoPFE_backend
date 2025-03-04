package com.pfe.pfe_planning.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="projetspfe")
public class ProjectPfe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private LocalDate submissionDate;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    private Teacher supervisor;

    @Enumerated(EnumType.STRING)
    private ProjectStatus status = ProjectStatus.IN_PROGRESS;

    public enum ProjectStatus {
        IN_PROGRESS,
        APPROVED,
        DEFENDED
    }
}
