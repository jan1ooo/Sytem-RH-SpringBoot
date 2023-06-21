package com.jan1ooo.systemrh.repository;

import com.jan1ooo.systemrh.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
