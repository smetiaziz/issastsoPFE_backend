package com.pfe.pfe_planning.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="availabilities")
public class Availability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    private LocalDate availabilityDate;
    private String timeSlots;  // Example: "9am-12pm;2pm-5pm"
}
