package com.pfe.pfe_planning.repository;

import com.pfe.pfe_planning.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    List<Teacher> findByTeachingHoursGreaterThan(int hours);
    List<Teacher> findByDepartmentId(Long departmentId);
}
