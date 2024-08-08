package com.VotingFinal_System.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VotingFinal_System.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
	
	Optional<Admin>findByUsername(String username);
	

}
