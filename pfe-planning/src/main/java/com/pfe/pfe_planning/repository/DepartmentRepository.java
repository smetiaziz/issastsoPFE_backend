package com.pfe.pfe_planning.repository;

import com.pfe.pfe_planning.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByName(String name);
}