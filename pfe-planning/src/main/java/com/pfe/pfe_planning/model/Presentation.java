package com.pfe.pfe_planning.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="presentations")
public class Presentation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime presentationDate;
    private String room;
    private String pdfPath;  // Path to generated PDF

    @Enumerated(EnumType.STRING)
    private PresentationStatus status = PresentationStatus.SCHEDULED;

    @ManyToOne
    @JoinColumn(name = "pfe_project_id")
    private ProjectPfe projectPfe;

    public enum PresentationStatus {
        SCHEDULED,
        COMPLETED
    }
}
