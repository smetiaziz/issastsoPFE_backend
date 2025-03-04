package com.pfe.pfe_planning.service;

import com.pfe.pfe_planning.model.ProjectPfe;
import com.pfe.pfe_planning.repository.ProjectPfeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectPFEService {

    private final ProjectPfeRepository projectPfeRepository;
    public ProjectPFEService(ProjectPfeRepository projectPfeRepository) {
        this.projectPfeRepository = projectPfeRepository;
    }
    public List<ProjectPfe> getProjectsByStatus(ProjectPfe.ProjectStatus status) {
        return projectPfeRepository.findByStatus(status);
    }

    public ProjectPfe createProject(ProjectPfe project) {
        return projectPfeRepository.save(project);
    }
}