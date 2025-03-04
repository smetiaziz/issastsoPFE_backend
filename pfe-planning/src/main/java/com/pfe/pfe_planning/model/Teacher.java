package com.pfe.pfe_planning.model;

import jakarta.persistence.*;

@Entity
@Table(name = "teachers")
public class Teacher extends User{
    private Integer teachingHours;
    private Integer supervisionHours;

}
