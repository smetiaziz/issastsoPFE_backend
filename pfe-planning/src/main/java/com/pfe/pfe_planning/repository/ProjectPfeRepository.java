package com.pfe.pfe_planning.repository;

import com.pfe.pfe_planning.model.ProjectPfe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectPfeRepository extends JpaRepository<ProjectPfe, Long> {
    List<ProjectPfe> findByStatus(ProjectPfe.ProjectStatus status);
    List<ProjectPfe> findBySupervisorId(Long teacherId);
}