package com.VotingFinal_System.Service;

import java.util.List;

import com.VotingFinal_System.entity.Election;

public interface ElectionService {
	

	void saveElection(Election election);
	 List<Election> getAllElections();
	}


