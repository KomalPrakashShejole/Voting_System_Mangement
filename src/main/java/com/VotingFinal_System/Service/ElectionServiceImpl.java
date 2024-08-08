package com.VotingFinal_System.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VotingFinal_System.Repository.ElectionRepository;
import com.VotingFinal_System.entity.Election;


@Service
public class ElectionServiceImpl implements ElectionService {

    @Autowired
    private ElectionRepository electionRepository;

    

	


	@Override
	public void saveElection(Election election) {
		// TODO Auto-generated method stub
		electionRepository.save(election);
		
	}

	@Override
	public List<Election> getAllElections() {
		// TODO Auto-generated method stub
		return electionRepository.findAll();
	}
}
