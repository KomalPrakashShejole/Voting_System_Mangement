package com.VotingFinal_System.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.VotingFinal_System.entity.Election;

@Repository
public interface ElectionRepository extends JpaRepository<Election, Long> {
}