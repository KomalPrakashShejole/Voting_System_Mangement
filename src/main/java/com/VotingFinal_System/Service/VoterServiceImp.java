package com.VotingFinal_System.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VotingFinal_System.Repository.VoterRepository;
import com.VotingFinal_System.entity.Voter;

@Service
public class VoterServiceImp implements VoterService {

    @Autowired
    private VoterRepository voterRepo;

    @Override
    public Voter saveVoter(Voter voter) {
        return voterRepo.save(voter);
    }

    @Override
    public List<Voter> voterlist() {
        return voterRepo.findAll();
    }

    @Override
    public void deleteById(int id) {
        voterRepo.deleteById(id);
    }

    @Override
    public Voter findById(int id) {
        Optional<Voter> findById = voterRepo.findById(id);
        return findById.orElse(null);
    }

    @Override
    public Voter updateVoter(Voter voter, int id) {
        Optional<Voter> voterdatab = voterRepo.findById(id);
        if (voterdatab.isPresent()) {
            Voter newVoter = voterdatab.get();
            newVoter.setVoterName(voter.getVoterName());
            newVoter.setDOB(voter.getDOB());
            newVoter.setGender(voter.getGender());
            newVoter.setUsername(voter.getUsername());
            newVoter.setPassword(voter.getPassword());
            voterRepo.save(newVoter);
            return newVoter;
        }
        return null;
    }

    @Override
    public Voter findByUsername(String username) {
        return voterRepo.findByUsername(username).orElse(null);
    }

    @Override
    public List<Voter> getAllVoters() {
        return voterRepo.findAll();
    }
}
