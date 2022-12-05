package com.development.todo1.dao;

import com.development.todo1.entity.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<CandidateEntity, Long> {
}
