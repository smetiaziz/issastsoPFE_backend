package com.pfe.pfe_planning.model;

import jakarta.persistence.*;

@Entity
@Table(name="jurymembers")
public class JuryMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "presentation_id")
    private Presentation presentation;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @Enumerated(EnumType.STRING)
    private JuryRole role;

    public enum JuryRole {
        SUPERVISOR,
        REPORTER,
        PRESIDENT
    }
}
