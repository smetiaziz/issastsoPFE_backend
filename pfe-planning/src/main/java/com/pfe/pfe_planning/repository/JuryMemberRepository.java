package com.pfe.pfe_planning.repository;

import com.pfe.pfe_planning.model.JuryMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JuryMemberRepository extends JpaRepository<JuryMember, Long> {
    List<JuryMember> findByPresentationId(Long presentationId);
    List<JuryMember> findByTeacherId(Long teacherId);
}