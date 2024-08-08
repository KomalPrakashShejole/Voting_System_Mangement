package com.VotingFinal_System.Repository;

import org.springframework.stereotype.Repository;

import com.VotingFinal_System.entity.Voter;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface VoterRepository  extends JpaRepository< Voter,Integer>{

	Optional<Voter> findByUsername(String username);

}
