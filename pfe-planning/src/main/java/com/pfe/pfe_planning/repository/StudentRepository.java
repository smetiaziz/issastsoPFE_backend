package com.pfe.pfe_planning.repository;

import com.pfe.pfe_planning.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByDepartmentId(Long departmentId);
    List<Student> findByLevel(String level);
}
