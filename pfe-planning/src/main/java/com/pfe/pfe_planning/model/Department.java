package com.pfe.pfe_planning.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "department")
    private Set<User> users;

    @OneToOne
    @JoinColumn(name = "head_id")
    private Teacher head;  // The department head (teacher)
}
