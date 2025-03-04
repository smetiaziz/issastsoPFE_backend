package com.pfe.pfe_planning.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "students")
@PrimaryKeyJoinColumn(name = "user_id")
public class Student extends User {
    private String level;
    private String groupName;
    private LocalDate enrollmentDate;
}
