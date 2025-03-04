package com.pfe.pfe_planning.repository;

import com.pfe.pfe_planning.model.Presentation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PresentationRepository extends JpaRepository<Presentation, Long> {
    List<Presentation> findByPresentationDateBetween(LocalDateTime start, LocalDateTime end);
    List<Presentation> findByStatus(Presentation.PresentationStatus status);
}