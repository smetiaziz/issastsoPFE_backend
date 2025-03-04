package com.pfe.pfe_planning.repository;

import com.pfe.pfe_planning.model.Availability;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AvailabilityRepository extends JpaRepository<Availability, Long> {
    List<Availability> findByTeacherIdAndAvailabilityDate(Long teacherId, LocalDate date);
    List<Availability> findByAvailabilityDate(LocalDate date);
}
